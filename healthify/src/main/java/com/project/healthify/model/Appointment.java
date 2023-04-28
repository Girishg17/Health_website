package com.project.healthify.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Entity
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String appointmentId;
    private String userId;
    private String doctorId;
    private String status;
    private String date;

    @Transient
    private String doctorName;

    @Transient
    private String hospitalName;

    @Transient
    private String hospitalLocation;

    @Transient
    private String userName;

    @Transient
    private Integer userAge;

    public Appointment() {
    }

    public Appointment(String userId, String doctorId, String status, String date) {
        this.userId = userId;
        this.doctorId = doctorId;
        this.status = status;
        this.date = date;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public static class Builder {
        private String appointmentId;
        private String userId;
        private String doctorId;
        private String status;
        private String date;
        private String doctorName;
        private String hospitalName;
        private String hospitalLocation;
        private String userName;
        private Integer userAge;
        
        Builder(){}
        public Builder(Appointment appointment){
            this.appointmentId = appointment.getAppointmentId();
            this.userId = appointment.getUserId();
            this.doctorId = appointment.getDoctorId();
            this.status = appointment.getStatus();
            this.date = appointment.getDate();
            this.doctorName = appointment.getDoctorName();
            this.hospitalName = appointment.getHospitalName();
            this.hospitalLocation = appointment.getHospitalLocation();
            this.userName = appointment.getUserName();
            this.userAge = appointment.getUserAge();
        }
        public Builder appointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder doctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder doctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder hospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
            return this;
        }

        public Builder hospitalLocation(String hospitalLocation) {
            this.hospitalLocation = hospitalLocation;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userAge(Integer userAge) {
            this.userAge = userAge;
            return this;
        }

        public Appointment build() {
            Appointment appointment = new Appointment();
            appointment.setAppointmentId(appointmentId);
            appointment.setUserId(userId);
            appointment.setDoctorId(doctorId);
            appointment.setStatus(status);
            appointment.setDate(date);
            appointment.setDoctorName(doctorName);
            appointment.setHospitalName(hospitalName);
            appointment.setHospitalLocation(hospitalLocation);
            appointment.setUserName(userName);
            appointment.setUserAge(userAge);
            return appointment;
        }
    }
}
