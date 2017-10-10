/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author rcollados
 */
@Embeddable
public class DistributionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDPERSON")
    private int idperson;
    @Basic(optional = false)
    @Column(name = "IDPROJECT")
    private int idproject;

    public DistributionPK() {
    }

    public DistributionPK(int idperson, int idproject) {
        this.idperson = idperson;
        this.idproject = idproject;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idperson;
        hash += (int) idproject;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistributionPK)) {
            return false;
        }
        DistributionPK other = (DistributionPK) object;
        if (this.idperson != other.idperson) {
            return false;
        }
        if (this.idproject != other.idproject) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.DistributionPK[ idperson=" + idperson + ", idproject=" + idproject + " ]";
    }
    
}
