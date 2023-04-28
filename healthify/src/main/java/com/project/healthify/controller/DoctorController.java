package com.project.healthify.controller;

import com.project.healthify.model.Doctor;
import com.project.healthify.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "*")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/hospital/{id}")
    public ResponseEntity<List<Doctor>> getByHospital(@PathVariable String id){
        List<Doctor> doctors = doctorService.getByHospital(id);
        return ResponseEntity.ok(doctors);
    }
}
