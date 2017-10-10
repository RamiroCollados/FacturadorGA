
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rcolladosr
 */
@Entity
@Table(name="PROJECTS")  
public class ProjectEntity implements Serializable {
    @Id
    @Column(name="IDPROJECT")
    protected int idProject;
    @Column (name="IDCLIENT")
    protected int idClient;
        
    @Column(name="BEGINDATE")
    private Date beginDate;
    @Column(name="ENDDATE")
    private Date endDate;
    @Column(name="AMOUNT")
    private double amount;
    @Column(name="HOURS")
    private double hours;
    @Column(name="HOURVALUE")
    private double hourValue;
    @Column(name="STATUS")
    private char status;
    @Column(name="EXCLUSIVITY")
    private char exclusivity;

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }


    

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getExclusivity() {
        return exclusivity;
    }

    public void setExclusivity(char exclusivity) {
        this.exclusivity = exclusivity;
    }
}
    

