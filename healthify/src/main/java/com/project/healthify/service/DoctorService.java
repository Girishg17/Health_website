package com.project.healthify.service;

import com.project.healthify.model.Doctor;
import com.project.healthify.model.Hospital;

import java.util.List;

public interface DoctorService extends RepositoryService<Doctor> {
    List<Doctor> getByHospital(String id);
}
