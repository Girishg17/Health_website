package com.project.healthify.service.implementation;

import com.project.healthify.model.Hospital;
import com.project.healthify.repository.HospitalRepository;
import com.project.healthify.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImplementation implements HospitalService {

    @Autowired
    HospitalRepository repository;
    @Override
    public List<Hospital> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Hospital> get(String id) {
        return repository.findById(id);
    }

    @Override
    public Hospital create(Hospital entity) {

        return repository.save(entity);
    }

    @Override
    public void save(Hospital entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
