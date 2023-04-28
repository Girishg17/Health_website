package com.project.healthify.service.implementation;

import com.project.healthify.model.PrescribedMedicine;
import com.project.healthify.repository.PrescribedMedicineRepository;
import com.project.healthify.service.PrescribedMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescribedMedicineServiceImplementation implements PrescribedMedicineService {

    @Autowired
    PrescribedMedicineRepository repository;

    @Override
    public List<PrescribedMedicine> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PrescribedMedicine> get(String id) {
        return repository.findById(id);
    }

    @Override
    public PrescribedMedicine create(PrescribedMedicine entity) {
        return repository.save(entity);
    }

    @Override
    public void save(PrescribedMedicine entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<PrescribedMedicine> getByPrescription(String id) {
        return repository.findByPrescriptionId(id);
    }
}
