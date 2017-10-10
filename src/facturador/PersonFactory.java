
package facturador;

import facturador.dataStructures.Assignation;
import facturador.dataStructures.Person;
import facturador.dataStructures.Project;
import facturador.distributor.ComplexDistributor;
import facturador.distributor.SimpleDistributor;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import persistence.AssignationEntity;
import persistence.PersonEntity;
import persistence.ProjectEntity;

/**
 *
 * @author rcollados
 */
public class PersonFactory {
    private PersonEntity personEntity;
    private ArrayList<AssignationEntity> assignations = new ArrayList<AssignationEntity>();
    private ArrayList<ProjectEntity> projects = new ArrayList<ProjectEntity>();
    private Session session;

    public PersonFactory() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    
    
    
    private PersonEntity getPersonData(int idPerson){
          
        PersonEntity pp = new PersonEntity();
        
        try{   
            
            pp = (PersonEntity) session.get(PersonEntity.class, idPerson);

            System.out.println("Person data retrieved: "+pp.getPersonName());
            
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }
        
        return pp;
    }
    
    private ArrayList<AssignationEntity> getAssignationsData(int idPerson){
        
        AssignationEntity ae = new AssignationEntity();
        try{   

            List<AssignationEntity> asigList = session.createQuery("from AssignationEntity").list();
            assignations = (ArrayList<AssignationEntity>) asigList;
            
            System.out.println("Assignations retrieved");
            
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }
        
        return assignations;
    }

    private ArrayList<ProjectEntity> getProjectsData(){
        
        try{              
            for (AssignationEntity assignation : assignations) {                
                ProjectEntity pe  = (ProjectEntity) session.get(ProjectEntity.class, assignation.getIdProject());
                        
                System.out.println("Project " + assignation.getIdProject() +" retrieved");

                projects.add(pe); 
            }
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }
        
        return projects;     
    }
    
 
    
    public Person retrievePersonData(int idPerson){
        
        Person person = new Person();
        
        personEntity = getPersonData(idPerson);
        assignations = getAssignationsData(idPerson);
        projects = getProjectsData();
        
        session.close();
        HibernateUtil.shutdown();
        
        return buildPerson(person);
    }
    
    private Person buildPerson(Person person){
        person.setPersonID(personEntity.getIdPerson());
        person.setPersonName(personEntity.getPersonName());
        person.setHours(personEntity.getHours());
        person.setHourCost(personEntity.getHourCost());
        person.setStatus(personEntity.getStatus());
        
        if(personEntity.getDistributionType() == 'S'){
            person.setDistributionType(new SimpleDistributor());
        }else{
            if(personEntity.getDistributionType() == 'C'){
                person.setDistributionType(new ComplexDistributor());
            }
        }
        
        person.setProjects(savePersonProjects(projects));
        person.setAssignations(savePersonAssignations(assignations));
        
        return person;
    }
    
    private ArrayList<Project> savePersonProjects(ArrayList<ProjectEntity> projectsFound){
        ArrayList<Project> projects = new ArrayList<>();
        
        for (ProjectEntity projectFound : projectsFound) {
            Project projectToSave = new Project();
            
            projectToSave.setIdProject(projectFound.getIdProject());
            projectToSave.setIdClient(projectFound.getIdClient());
            projectToSave.setBeginDate(projectFound.getBeginDate());
            projectToSave.setEndDate(projectFound.getEndDate());
            projectToSave.setAmount(projectFound.getAmount());
            projectToSave.setHours(projectFound.getHours());
            projectToSave.setHourValue(projectFound.getHourValue());
            projectToSave.setStatus(projectFound.getStatus());
            projectToSave.setExclusivity(projectFound.getExclusivity());
            
            projects.add(projectToSave);
        }
        
        return projects;
    } 
    
    private ArrayList<Assignation> savePersonAssignations(ArrayList<AssignationEntity> assignationsFound){
        ArrayList<Assignation> assignations = new ArrayList<>();
        
        for (AssignationEntity assignationFound : assignationsFound) {
            Assignation assignationToSave = new Assignation();
            
            assignationToSave.setIdProject(assignationFound.getIdProject());
            assignationToSave.setIdPerson(assignationFound.getIdPerson());
            assignationToSave.setBeginDate(assignationFound.getBeginDate());
            assignationToSave.setEndDate(assignationFound.getEndDate());
            assignationToSave.setHours(assignationFound.getHours());
            assignationToSave.setHourValue(assignationFound.getHourValue());

            assignations.add(assignationToSave);
        }   
        
        return assignations;
    } 
    
}
