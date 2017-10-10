
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rcollados
 */
@Entity
@Table(name = "DISTRIBUTION")
public class DistributionEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DistributionPK distributionPK;
    @Column(name = "EFFECTIVEDATE")
    @Temporal(TemporalType.DATE)
    private Date effectivedate;
    @Column(name = "HOURS")
    private Double hours;
    @Column(name = "VALUE")
    private Double value;
    @Column(name = "COST")
    private Double cost;
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "AMOUNT")
    private Double amount;

    public DistributionEntity() {
    }

    public DistributionEntity(DistributionPK distributionPK) {
        this.distributionPK = distributionPK;
    }

    public DistributionEntity(int idperson, int idproject) {
        this.distributionPK = new DistributionPK(idperson, idproject);
    }

    public DistributionPK getDistributionPK() {
        return distributionPK;
    }

    public void setDistributionPK(DistributionPK distributionPK) {
        this.distributionPK = distributionPK;
    }

    public Date getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(Date effectivedate) {
        this.effectivedate = effectivedate;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (distributionPK != null ? distributionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistributionEntity)) {
            return false;
        }
        DistributionEntity other = (DistributionEntity) object;
        if ((this.distributionPK == null && other.distributionPK != null) || (this.distributionPK != null && !this.distributionPK.equals(other.distributionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.Distribution[ distributionPK=" + distributionPK + " ]";
    }
    
}
