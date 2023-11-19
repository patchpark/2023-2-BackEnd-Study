package com.example.GDSC__8th_HW.controller;

import com.example.GDSC__8th_HW.domain.DTO.PatientDTO;
import com.example.GDSC__8th_HW.domain.entity.Patient;
import com.example.GDSC__8th_HW.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping()
    public List<Patient> getAllPatients(){return patientService.getAllPatients();}

    @PostMapping()
    public void createPatient(@RequestBody PatientDTO patientDTO) {
        patientService.createPatient(patientDTO);
    }
}
