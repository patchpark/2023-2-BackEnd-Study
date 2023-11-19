package com.example.GDSC__8th_HW.controller;

import com.example.GDSC__8th_HW.domain.DTO.ReservationDTO;
import com.example.GDSC__8th_HW.domain.DTO.ReservationUpdateDTO;
import com.example.GDSC__8th_HW.domain.entity.Reservation;
import com.example.GDSC__8th_HW.service.ReservationService;
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

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody ReservationUpdateDTO requestDTO){
        reservationService.updateReservation(id, requestDTO);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}
