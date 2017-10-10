
package persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PEOPLE")
public class PersonEntity implements Serializable {
    @Id 
    @Column(name="IDPERSON")
    private int idPerson;
    
    @Column(name="NAME")
    private String personName;
    
    @Column (name="CATEGORY")
    private String category;
    
    @Column(name="HOURS")
    private int hours;
    
    @Column(name="HOURCOST")
    private double hourCost;
    
    @Column(name="DISTRIBUTIONTYPE")
    private char distributionType;
    
    @Column(name="STATUS")
    private char status;

    
    public PersonEntity() {
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourCost() {
        return hourCost;
    }

    public void setHourCost(double hourCost) {
        this.hourCost = hourCost;
    }

    public char getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(char distributionType) {
        this.distributionType = distributionType;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
    
    
}
