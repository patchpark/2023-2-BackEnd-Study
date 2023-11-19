package com.example.GDSC__8th_HW.controller;

import com.example.GDSC__8th_HW.domain.entity.Hospital;
import com.example.GDSC__8th_HW.domain.DTO.HospitalDTO;
import com.example.GDSC__8th_HW.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping()
    public List<Hospital> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @PostMapping()
    public void createHospital(@RequestBody HospitalDTO hospitalDTO) {
        hospitalService.createHospital(hospitalDTO);
    }
}
