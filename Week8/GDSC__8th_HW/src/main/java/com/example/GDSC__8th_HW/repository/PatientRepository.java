package com.example.GDSC__8th_HW.repository;

import com.example.GDSC__8th_HW.domain.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
