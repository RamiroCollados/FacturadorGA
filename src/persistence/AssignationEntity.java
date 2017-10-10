
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rcollados
 */
@Entity
@Table(name="ASSIGNATIONS")
public class AssignationEntity implements Serializable {
    @Id
    @Column (name="IDPROJECT")
    private int idProject;
    
    @Id
    @Column (name="IDPERSON")
    private int idPerson;
    
    @Column (name="BEGINDATE")
    private Date beginDate;
    
    @Column (name="ENDDATE")
    private Date endDate;
    
    @Column (name="HOURS")
    private double hours;
    
    @Column (name="HOURVALUE")
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AssignationEntity other = (AssignationEntity) obj;
        if (this.idProject != other.idProject) {
            return false;
        }
        if (this.idPerson != other.idPerson) {
            return false;
        }
        return true;
    }
    
    
           
}
