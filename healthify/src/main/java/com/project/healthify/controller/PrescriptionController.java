package com.project.healthify.controller;

import com.project.healthify.model.Appointment;
import com.project.healthify.model.PrescribedMedicine;
import com.project.healthify.model.Prescription;
import com.project.healthify.service.AppointmentService;
import com.project.healthify.service.PrescribedMedicineService;
import com.project.healthify.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/prescription")
@CrossOrigin(origins = "*")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @Autowired
    PrescribedMedicineService prescribedMedicineService;

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/add")
    public ResponseEntity<String> addPrescription(@RequestBody Prescription prescription){
        Prescription prescriptionNew = prescriptionService.create(prescription);
        for(PrescribedMedicine prescribedMedicine:prescription.getPrescribedMedicines()){
            prescribedMedicine.setPrescriptionId(prescriptionNew.getPrescriptionId());
            prescribedMedicineService.create(prescribedMedicine);
        }
        changeStatus(prescriptionNew.getAppointmentId());
        return ResponseEntity.ok("Prescription added successfully");
    }

    @GetMapping("/appointment/{id}")
    public ResponseEntity<Prescription> getPrescription(@PathVariable String id){
        Prescription prescription = prescriptionService.getByAppointment(id);
        prescription.setPrescribedMedicines(prescribedMedicineService.getByPrescription(prescription.getPrescriptionId()));
        return ResponseEntity.ok(prescription);
    }

    private void changeStatus(String appointmentId) {
        Optional<Appointment> appointmentOptional = appointmentService.get(appointmentId);
        if(appointmentOptional.isPresent()){
            Appointment appointment = appointmentOptional.get();
            appointment.setStatus("done");
            appointmentService.save(appointment);
        }
    }

}
