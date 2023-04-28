package com.project.healthify.service.implementation;

import com.project.healthify.model.Medicine;
import com.project.healthify.repository.MedicineRepository;
import com.project.healthify.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineServiceImplementation implements MedicineService {

    @Autowired
    MedicineRepository repository;
    @Override
    public List<Medicine> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Medicine> get(String id) {
        return repository.findById(id);
    }

    @Override
    public Medicine create(Medicine entity) {
        return repository.save(entity);
    }

    @Override
    public void save(Medicine entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
