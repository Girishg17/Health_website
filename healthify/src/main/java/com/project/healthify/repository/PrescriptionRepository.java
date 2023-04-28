package com.project.healthify.repository;

import com.project.healthify.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, String> {
    @Query("SELECT p FROM Prescription p WHERE p.appointmentId = :appointmentId")
    List<Prescription> findByAppointmentId(@Param("appointmentId") String appointmentId);
}
