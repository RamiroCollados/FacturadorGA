
package test;

import facturador.HibernateUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import persistence.PersonEntity;
import persistence.ProjectEntity;

/**
 *
 * @author rcollados
 */
public class BaseTest {
    
    
    public static void listPeople(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{   
            Query query = session.createQuery("from PersonPersistence");
            List people = query.list();
            
            System.out.println( people);  
            
            HibernateUtil.shutdown();
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }finally {
           session.close(); 
        }       
    }
    
    
    public static void savePerson(){
        PersonEntity pp = new PersonEntity();
        pp.setIdPerson(1111);
        pp.setPersonName("Pablo Finn");
        pp.setHours(160);
        pp.setHourCost(200);
        pp.setDistributionType('2');
        pp.setStatus('Y');
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{   
            session.beginTransaction();
            session.save(pp);
            session.getTransaction().commit();
            
            System.out.println("Person saved.");
                      
            HibernateUtil.shutdown();
            
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }finally {
           session.close(); 
        }     
    }
    
    public static void saveProject() throws ParseException{
        DateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
        
        Date beginDate = formatter.parse("2015-05-19");
        
        ProjectEntity  pe = new ProjectEntity();
//        pe.setIdProject(1001);
//        pe.setIdClient(1001);
        pe.setBeginDate(beginDate);
        pe.setEndDate(null);
        pe.setAmount(25000);
        pe.setHours(0);
        pe.setStatus('A');
        pe.setExclusivity('N');

        Session session = HibernateUtil.getSessionFactory().openSession();
        try{   
            session.beginTransaction();
            session.save(pe);
            session.getTransaction().commit();
            
            System.out.println("Project saved.");
                      
            HibernateUtil.shutdown();
            
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }finally {
           session.close(); 
        } 
        
    }
    
    
    public static PersonEntity getPersonObject(int idPerson){
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        PersonEntity pp = new PersonEntity();
        try{   
            
            pp= (PersonEntity) session.get(PersonEntity.class, idPerson);

            System.out.println("Person retrieved: "+pp.getPersonName());

            HibernateUtil.shutdown();
            
        }catch (HibernateException e) {
           e.printStackTrace(); 
        }finally {
           session.close(); 
        } 
        
        return pp;
    }

    
    
    
    
}
