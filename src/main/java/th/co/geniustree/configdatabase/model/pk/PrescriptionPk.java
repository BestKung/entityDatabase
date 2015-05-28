/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.configdatabase.model.pk;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kekhuay
 */
@Embeddable
public class PrescriptionPk implements Serializable {

    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "crew_id")
    private Integer crewId;

    public PrescriptionPk() {
    }

    public PrescriptionPk(Integer doctorId, Integer crewId) {
        this.doctorId = doctorId;
        this.crewId = crewId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public Integer getCrewId() {
        return crewId;
    }
}
