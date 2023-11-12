package com.example.GDSC__7th_HW.service;

import com.example.GDSC__7th_HW.domain.DTO.DoctorDTO;
import com.example.GDSC__7th_HW.domain.DTO.ReservationDTO;
import com.example.GDSC__7th_HW.domain.entity.Doctor;
import com.example.GDSC__7th_HW.domain.entity.MedicalDepartment;
import com.example.GDSC__7th_HW.domain.entity.Patient;
import com.example.GDSC__7th_HW.domain.entity.Reservation;
import com.example.GDSC__7th_HW.repository.DoctorRepository;
import com.example.GDSC__7th_HW.repository.MedicalDepartmentRepository;
import com.example.GDSC__7th_HW.repository.PatientRepository;
import com.example.GDSC__7th_HW.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createReservation(ReservationDTO reservationDTO){
        Doctor doctor = doctorRepository.findById(reservationDTO.getDoctorId())
                .orElseThrow(RuntimeException::new);
        Patient patient = patientRepository.findById(reservationDTO.getPatientId())
                .orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(reservationDTO.getTime(), patient, doctor));
    }

    public List<Reservation> getAllReservations(){return reservationRepository.findAll();}
}
