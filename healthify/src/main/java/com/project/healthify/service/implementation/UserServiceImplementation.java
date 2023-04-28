package com.project.healthify.service.implementation;

import com.project.healthify.model.User;
import com.project.healthify.repository.UserRepository;
import com.project.healthify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository repository;
    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> get(String id) {
        return repository.findById(id);
    }

    @Override
    public User create(User entity) {
        return repository.save(entity);
    }

    @Override
    public void save(User entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
