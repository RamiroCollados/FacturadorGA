
package facturador.distributor;

import facturador.dataStructures.Person;
import facturador.dataStructures.Project;
import java.util.ArrayList;

/**
 *
 * @author Ramiro
 */
public class ComplexDistributor implements IDistributor {

    @Override
    public void distributeHours(Person person) {
//        ArrayList<Project> projects = person.getProjects();
//        
//        double projectAmount;
//	double hoursToConsume;
//	double amountToConsume;
//	double remainingAmount;
//
//        double personHoursToCover = person.getHours();
//	double personHourCost = person.getHourCost();
//        
//        for (Project project : projects) {
//            projectAmount = project.getAvailableAmount();
//            
//            hoursToConsume = (projectAmount / person.getHourCost());
//            hoursToConsume = Math.floor(hoursToConsume);
//            
//            if(hoursToConsume > personHoursToCover){
//                personHoursToCover = hoursToConsume;    
//            }
//            
//            amountToConsume = hoursToConsume * personHourCost; 
//            
//            if(amountToConsume < projectAmount){
//		remainingAmount = projectAmount - amountToConsume;
//            }else{
//		remainingAmount = 0;
//            }
//            
//            
//            personHoursToCover = personHoursToCover - hoursToConsume;
//		
//            //Magia para impactar en tablas.	
//	 
//            //Una vez consumida la totalidad de las horas, salir del ciclo	
//            if(personHoursToCover == 0){
//		break;
//            }
//                 
//        }

    }


    
}
