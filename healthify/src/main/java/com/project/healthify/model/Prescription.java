package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.List;

@Entity
public class Prescription implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String prescriptionId;
    private String appointmentId;
    private String description;

    @Transient
    private List<PrescribedMedicine> prescribedMedicines;

    public Prescription() {
    }

    public Prescription(String appointmentId, String description) {
        this.appointmentId = appointmentId;
        this.description = description;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public List<PrescribedMedicine> getPrescribedMedicines() {
        return prescribedMedicines;
    }

    public void setPrescribedMedicines(List<PrescribedMedicine> prescribedMedicines) {
        this.prescribedMedicines = prescribedMedicines;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", appointmentId='" + appointmentId + '\'' +
                ", description='" + description + '\'' +
                ", prescribedMedicines=" + prescribedMedicines +
                '}';
    }
}
