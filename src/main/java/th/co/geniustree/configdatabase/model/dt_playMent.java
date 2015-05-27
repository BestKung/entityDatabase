/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import th.co.geniustree.configdatabase.model.pk.playMentPk;

/**
 *
 * @author Best
 */
@Entity
public class dt_playMent implements Serializable{
  
    @EmbeddedId
    private playMentPk id;
    
    @ManyToOne
    @JoinColumn(name = "crew_id" , insertable = false , updatable = false)
    private dt_Crew crewid;
    
    @ManyToOne
    @JoinColumn(name = "custumer_id" , insertable = false , updatable = false)
    private dt_Customer customerid;
    
    private Date date;
    private Double price;

    public dt_playMent() {
    }

    public dt_playMent(playMentPk id, dt_Crew crewid, dt_Customer customerid, Date date, Double price) {
        this.id = id;
        this.crewid = crewid;
        this.customerid = customerid;
        this.date = date;
        this.price = price;
    }

    public playMentPk getId() {
        return id;
    }

    public void setId(playMentPk id) {
        this.id = id;
    }

    public dt_Crew getCrewid() {
        return crewid;
    }

    public void setCrewid(dt_Crew crewid) {
        this.crewid = crewid;
    }

    public dt_Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(dt_Customer customerid) {
        this.customerid = customerid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final dt_playMent other = (dt_playMent) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
