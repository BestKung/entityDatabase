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
public class AppointmentPk implements Serializable {

    @Column(name = "costomer_id")
    private Integer customerId;
    @Column(name = "doctor_id")
    private Integer doctorId;

    public AppointmentPk() {
    }

    public AppointmentPk(Integer customerId, Integer doctorId) {
        this.customerId = customerId;
        this.doctorId = doctorId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }
}
