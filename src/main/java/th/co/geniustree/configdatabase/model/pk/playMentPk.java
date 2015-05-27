/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model.pk;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author Best
 */
@Embeddable
public class playMentPk implements Serializable{
    
    private Integer custumer_id;
    private Integer crew_id;

    public playMentPk() {
    }

    public playMentPk(Integer custumer_id, Integer crew_id) {
        this.custumer_id = custumer_id;
        this.crew_id = crew_id;
    }

    public Integer getCustumer_id() {
        return custumer_id;
    }

    public void setCustumer_id(Integer custumer_id) {
        this.custumer_id = custumer_id;
    }

    public Integer getCrew_id() {
        return crew_id;
    }

    public void setCrew_id(Integer crew_id) {
        this.crew_id = crew_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.custumer_id);
        hash = 67 * hash + Objects.hashCode(this.crew_id);
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
        final playMentPk other = (playMentPk) obj;
        if (!Objects.equals(this.custumer_id, other.custumer_id)) {
            return false;
        }
        if (!Objects.equals(this.crew_id, other.crew_id)) {
            return false;
        }
        return true;
    }
    
    
}
