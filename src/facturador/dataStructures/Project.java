
package facturador.dataStructures;

import java.util.Date;

/**
 *
 * @author Ramiro Collados
 */
public class Project {

    private int idProject;
    private int idClient;
    private Date beginDate;
    private Date endDate;
    private double amount;
    private double hours;
    private double hourValue;
    private char status;
    private char exclusivity;

    public Project() {
    }


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
