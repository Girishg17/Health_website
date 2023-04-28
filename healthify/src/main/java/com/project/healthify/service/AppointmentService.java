package com.project.healthify.service;

import com.project.healthify.model.Appointment;

import java.util.List;

public interface AppointmentService extends RepositoryService<Appointment> {
    List<Appointment> getDoctorAppointment(String id);
    List<Appointment> getUserAppointment(String id);
}
