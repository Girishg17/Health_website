package com.project.healthify.controller;

import com.project.healthify.model.Hospital;
import com.project.healthify.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "*")
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
    @GetMapping("/all")
    public ResponseEntity<List<Hospital>> getHospitals(){
        List<Hospital> hospitals = hospitalService.getAll();
        return ResponseEntity.ok(hospitals);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHospital(@RequestBody Hospital hospital){
        hospitalService.create(hospital);
        return ResponseEntity.ok("Hospital added successfully");
    }
}
