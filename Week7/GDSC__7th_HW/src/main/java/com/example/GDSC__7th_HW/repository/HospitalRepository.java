package com.example.GDSC__7th_HW.repository;

import com.example.GDSC__7th_HW.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
