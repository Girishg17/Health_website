package com.project.healthify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    private String userId;
    private String email;
    private String phoneNumber;
    private String name;
    private Integer age;

    public User(){}
    public User(String userId, String email, String phoneNumber, String name, Integer age) {
        this.userId = userId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.age = age;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}