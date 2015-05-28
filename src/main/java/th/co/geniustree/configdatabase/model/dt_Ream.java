/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class dt_Ream implements Serializable {

    @EmbeddedId
    private dt_ReamPK id;
    private String medicine;
    private String customer_id;

    @ManyToOne
    @JoinColumn(
            name = "crew_id",
            insertable = false,
            updatable = false
    )
    private dt_Crew crew;

    @ManyToOne
    @JoinColumn(
            name = "stock_id",
            insertable = false,
            updatable = false
    )
    private dt_Stock stock;

    public dt_ReamPK getId() {
        return id;
    }

    public void setId(dt_ReamPK id) {
        this.id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.medicine);
        hash = 83 * hash + Objects.hashCode(this.customer_id);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final dt_Ream other = (dt_Ream) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.medicine, other.medicine)) {
            return false;
        }
        if (!Objects.equals(this.customer_id, other.customer_id)) {
            return false;
        }
        return true;
    }

}
