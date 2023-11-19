package com.example.GDSC__8th_HW.repository;

import com.example.GDSC__8th_HW.domain.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
