package com.example.GDSC__8th_HW.repository;

import com.example.GDSC__8th_HW.domain.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}