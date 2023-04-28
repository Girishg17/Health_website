package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private String doctorId;
    private String doctorName;
    private String hospitalId;

    public Doctor() {
    }

    public Doctor(String doctorId, String doctorName, String hospitalId) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.hospitalId = hospitalId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
}
