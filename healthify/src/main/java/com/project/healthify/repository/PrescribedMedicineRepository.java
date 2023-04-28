package com.project.healthify.repository;

import com.project.healthify.model.PrescribedMedicine;
import com.project.healthify.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescribedMedicineRepository extends JpaRepository<PrescribedMedicine, String> {
    @Query("SELECT p FROM PrescribedMedicine p WHERE p.prescriptionId = :prescriptionId")
    List<PrescribedMedicine> findByPrescriptionId(@Param("prescriptionId") String prescriptionId);
}
