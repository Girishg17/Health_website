package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
public class PrescribedMedicine implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String prescribedMedicineId;
    private String prescriptionId;
    private String medicineId;

    private String medicineName;
    private String intake;

    public PrescribedMedicine() {
    }

    public PrescribedMedicine(String prescriptionId, String medicineId, String medicineName, String intake) {
        this.prescriptionId = prescriptionId;
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.intake = intake;
    }

    public String getPrescribedMedicineId() {
        return prescribedMedicineId;
    }

    public void setPrescribedMedicineId(String prescribedMedicineId) {
        this.prescribedMedicineId = prescribedMedicineId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @Override
    public String toString() {
        return "PrescribedMedicine{" +
                "prescribedMedicineId='" + prescribedMedicineId + '\'' +
                ", prescriptionId='" + prescriptionId + '\'' +
                ", medicineId='" + medicineId + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", intake='" + intake + '\'' +
                '}';
    }
}
