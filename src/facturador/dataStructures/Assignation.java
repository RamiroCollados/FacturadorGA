
package facturador.dataStructures;

import java.util.Date;

/**
 *
 * @author rcollados
 */
public class Assignation {
    private int idProject;
    private int idPerson;
    private Date beginDate;
    private Date endDate;
    private double hours;
    private double hourValue;

    
    
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
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
    
}
