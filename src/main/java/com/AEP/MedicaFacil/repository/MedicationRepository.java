package com.AEP.MedicaFacil.repository;

import com.AEP.MedicaFacil.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
