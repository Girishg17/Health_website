package com.project.healthify.controller;

import com.project.healthify.model.Appointment;
import com.project.healthify.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "*")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("/{id}")
    public ResponseEntity<Appointment> getAppointment(@PathVariable String id){
        Optional<Appointment> optional = appointmentService.get(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Appointment>> getAppointments(@PathVariable String id){
        List<Appointment> appointments = appointmentService.getUserAppointment(id);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<List<Appointment>> getAppointmentDoctor(@PathVariable String id){
        List<Appointment> appointments = appointmentService.getDoctorAppointment(id);
        return ResponseEntity.ok(appointments);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addAppointment(@RequestBody Appointment appointment){
        appointment.setStatus("pending");
        appointment.setDate(new Date().toString());
        appointmentService.create(appointment);
        return ResponseEntity.ok("Appointment added successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable String id){
        appointmentService.delete(id);
        return ResponseEntity.ok("Appointment deleted successfully");
    }
}
