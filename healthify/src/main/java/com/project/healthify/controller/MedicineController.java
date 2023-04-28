package com.project.healthify.controller;

import com.project.healthify.model.Medicine;
import com.project.healthify.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine")
@CrossOrigin(origins = "*")
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @GetMapping("/all")
    public List<Medicine> getAllMedicine(){
        return medicineService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMedicine(@RequestBody Medicine medicine){
        medicineService.create(medicine);
        return ResponseEntity.ok("Medicine added successfully");
    }
}
