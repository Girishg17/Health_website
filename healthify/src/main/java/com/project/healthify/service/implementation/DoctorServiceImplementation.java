package com.project.healthify.service.implementation;

import com.project.healthify.model.Doctor;
import com.project.healthify.model.Medicine;
import com.project.healthify.repository.DoctorRepository;
import com.project.healthify.repository.MedicineRepository;
import com.project.healthify.service.DoctorService;
import com.project.healthify.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImplementation implements DoctorService {

    @Autowired
    DoctorRepository repository;
    @Override
    public List<Doctor> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Doctor> get(String id) {
        return repository.findById(id);
    }

    @Override
    public Doctor create(Doctor entity) {

        return repository.save(entity);
    }

    @Override
    public void save(Doctor entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Doctor> getByHospital(String id) {
        return repository.findByHospitalId(id);
    }
}
