package com.project.healthify.service.implementation;

import com.project.healthify.model.Prescription;
import com.project.healthify.repository.PrescriptionRepository;
import com.project.healthify.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionServiceImplementation implements PrescriptionService {

    @Autowired
    PrescriptionRepository repository;

    @Override
    public List<Prescription> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Prescription> get(String id) {
        return repository.findById(id);
    }

    @Override
    public Prescription create(Prescription entity) {
        return repository.save(entity);
    }

    @Override
    public void save(Prescription entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Prescription getByAppointment(String id) {
        return repository.findByAppointmentId(id).get(0);
    }
}
