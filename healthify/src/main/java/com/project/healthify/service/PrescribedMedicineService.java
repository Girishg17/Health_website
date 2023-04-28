package com.project.healthify.service;

import com.project.healthify.model.Doctor;
import com.project.healthify.model.PrescribedMedicine;

import java.util.List;

public interface PrescribedMedicineService extends RepositoryService<PrescribedMedicine> {
    List<PrescribedMedicine> getByPrescription(String id);
}
