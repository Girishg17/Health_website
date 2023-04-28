package com.project.healthify.service;

import com.project.healthify.model.PrescribedMedicine;
import com.project.healthify.model.Prescription;

import java.util.List;

public interface PrescriptionService extends RepositoryService<Prescription> {
    Prescription getByAppointment(String id);
}
