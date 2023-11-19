package com.example.GDSC__8th_HW.controller;

import com.example.GDSC__8th_HW.domain.entity.MedicalDepartment;
import com.example.GDSC__8th_HW.domain.DTO.MedicalDepartmentDTO;
import com.example.GDSC__8th_HW.service.MedicalDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalDepartments")
@RequiredArgsConstructor
public class MedicalDepartmentController {
    private final MedicalDepartmentService medicalDepartmentService;

    @GetMapping()
    public List<MedicalDepartment> getAllHospitals() {
        return medicalDepartmentService.getAllHospitals();
    }

    @PostMapping()
    public void createHospital(@RequestBody MedicalDepartmentDTO medicalDepartmentDTO) {
        medicalDepartmentService.createHospital(medicalDepartmentDTO);
    }
}