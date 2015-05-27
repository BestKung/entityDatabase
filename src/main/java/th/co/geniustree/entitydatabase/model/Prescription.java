/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.entitydatabase.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author kekhuay
 */
@Entity
@Table(name = "PRESCRIPTION")
public class Prescription implements Serializable {
    @Id
    private String doctorId;
    private String crewId;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private Integer drugId;
    private Integer drugQuantity;
    private Double drugPrice;
    private String customer;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getCrewId() {
        return crewId;
    }

    public void setCrewId(String crewId) {
        this.crewId = crewId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(Integer drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.doctorId);
        hash = 67 * hash + Objects.hashCode(this.crewId);
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
        final Prescription other = (Prescription) obj;
        if (!Objects.equals(this.doctorId, other.doctorId)) {
            return false;
        }
        if (!Objects.equals(this.crewId, other.crewId)) {
            return false;
        }
        return true;
    }
}
