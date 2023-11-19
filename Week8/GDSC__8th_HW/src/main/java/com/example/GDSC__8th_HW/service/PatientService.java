package com.example.GDSC__8th_HW.service;

import com.example.GDSC__8th_HW.domain.DTO.HospitalDTO;
import com.example.GDSC__8th_HW.domain.DTO.PatientDTO;
import com.example.GDSC__8th_HW.domain.entity.Hospital;
import com.example.GDSC__8th_HW.domain.entity.Patient;
import com.example.GDSC__8th_HW.repository.HospitalRepository;
import com.example.GDSC__8th_HW.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public void createPatient(PatientDTO patientDTO) {
        patientRepository.save(new Patient(patientDTO.getName()));
    }


    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
