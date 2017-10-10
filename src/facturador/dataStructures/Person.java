
package facturador.dataStructures;

import facturador.distributor.IDistributor;
import java.util.ArrayList;

/**
 *
 * @author Ramiro Collados
 */

public class Person {
    private int personID;
    private String personName;
    private int hours;
    private double hourCost;
  
    private IDistributor distributionType;
    private char status;
    
    private ArrayList<Project> projects;
    private ArrayList<Assignation> assignations;

    public Person() {
    }
    

    //getters and setters
    public IDistributor getDistributionType() {
        return distributionType;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public int getPersonID() {
        return personID;
    }

    public String getPersonName() {
        return personName;
    }

    public int getHours() {
        return hours;
    }

    public double getHourCost() {
        return hourCost;
    }

    public ArrayList<Assignation> getAssignations() {
        return assignations;
    }

    public char getStatus() {
        return status;
    }
    

    public void setAssignations(ArrayList<Assignation> assignations) {
        this.assignations = assignations;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourCost(double hourCost) {
        this.hourCost = hourCost;
    }

    public void setDistributionType(IDistributor distributionType) {
        this.distributionType = distributionType;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
