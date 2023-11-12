package com.example.GDSC__7th_HW.controller;

import com.example.GDSC__7th_HW.domain.DTO.ReservationDTO;
import com.example.GDSC__7th_HW.domain.entity.Reservation;
import com.example.GDSC__7th_HW.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping()
    public void createReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationService.createReservation(reservationDTO);
    }
}
