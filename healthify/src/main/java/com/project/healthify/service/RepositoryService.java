package com.project.healthify.service;

import com.project.healthify.model.User;

import java.util.List;
import java.util.Optional;

public interface RepositoryService<T> extends Service {
    List<T> getAll();

    Optional<T> get(String id);

    T create(T entity);

    void save(T entity);

    void delete(String id);
}
