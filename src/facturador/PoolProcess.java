
package facturador;

import facturador.dataStructures.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramiro Collados
 */
public class PoolProcess {
    private ArrayList<Person> people = new ArrayList();

    //Constructor
    public PoolProcess(ArrayList<Person> people) {
        this.people = people;
    }

    public PoolProcess() {
    }
    
    
    public List<?> getPeopleData(){
        
       people.add(new PersonFactory().retrievePersonData(1234));
        
       return people;
    }
    
    
    public void processPeopleData(){    
        for (Person person : people) {
            person.getDistributionType().distributeHours(person);
        }      
    }
}
