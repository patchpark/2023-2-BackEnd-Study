package com.example.GDSC__7th_HW.controller;

import com.example.GDSC__7th_HW.domain.DTO.DoctorDTO;
import com.example.GDSC__7th_HW.domain.DTO.MedicalDepartmentDTO;
import com.example.GDSC__7th_HW.domain.entity.Doctor;
import com.example.GDSC__7th_HW.domain.entity.MedicalDepartment;
import com.example.GDSC__7th_HW.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping()
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping()
    public void createHospital(@RequestBody DoctorDTO doctorDTO) {
        doctorService.createDoctor(doctorDTO);
    }
}
