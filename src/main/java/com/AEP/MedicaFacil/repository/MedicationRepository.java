package com.AEP.MedicaFacil.repository;

import com.AEP.MedicaFacil.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<User, Long> {
}
