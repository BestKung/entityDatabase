/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import th.co.geniustree.configdatabase.model.pk.PrescriptionPk;

/**
 *
 * @author kekhuay
 */
@Entity
@Table(name = "PRESCRIPTION")
public class dt_Prescription implements Serializable {

    @EmbeddedId
    private PrescriptionPk id;
    private Date date;
    private Integer drugId;
    private Integer drugQuantity;
    private Double drugPrice;
    private String customer;
    @ManyToOne
    @Column(name = "doctor_id", insertable = false, updatable = false)
    private Integer doctorId;
    @ManyToOne
    @Column(name = "crew_id", insertable = false, updatable = false)
    private Integer crewId;

    public PrescriptionPk getId() {
        return id;
    }

    public void setId(PrescriptionPk id) {
        this.id = id;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getCrewId() {
        return crewId;
    }

    public void setCrewId(Integer crewId) {
        this.crewId = crewId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final dt_Prescription other = (dt_Prescription) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
