package com.project.healthify.repository;

import com.project.healthify.model.Appointment;
import com.project.healthify.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
    @Query("SELECT a FROM Doctor a WHERE a.hospitalId = :hospitalId")
    List<Doctor> findByHospitalId(@Param("hospitalId") String hospitalId);
}
