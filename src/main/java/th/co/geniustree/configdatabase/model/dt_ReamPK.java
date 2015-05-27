/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model;

import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author Jasin007
 */
@Embeddable
public class dt_ReamPK {

    private String id_crew;
    private String id_stock;

    public dt_ReamPK() {
    }

    public dt_ReamPK(String id_crew, String id_stock) {
        this.id_crew = id_crew;
        this.id_stock = id_stock;
    }

    public String getId_crew() {
        return id_crew;
    }

    public String getId_stock() {
        return id_stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id_crew);
        hash = 31 * hash + Objects.hashCode(this.id_stock);
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
        final dt_ReamPK other = (dt_ReamPK) obj;
        if (!Objects.equals(this.id_crew, other.id_crew)) {
            return false;
        }
        if (!Objects.equals(this.id_stock, other.id_stock)) {
            return false;
        }
        return true;
    }
    
}
