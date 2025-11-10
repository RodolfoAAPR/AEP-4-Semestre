package com.AEP.MedicaFacil.repository;

import com.AEP.MedicaFacil.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<User, Long> {
}
