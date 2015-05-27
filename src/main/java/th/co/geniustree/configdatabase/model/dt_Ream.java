/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;


@Entity
public class dt_Ream implements Serializable{
    private String id_crew;
    private String id_stock;
    private String medicine;
    private String customer_id;

    public String getId_crew() {
        return id_crew;
    }

    public void setId_crew(String id_crew) {
        this.id_crew = id_crew;
    }

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
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
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id_crew);
        hash = 47 * hash + Objects.hashCode(this.id_stock);
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
        if (!Objects.equals(this.id_crew, other.id_crew)) {
            return false;
        }
        if (!Objects.equals(this.id_stock, other.id_stock)) {
            return false;
        }
        return true;
    }
    
}
