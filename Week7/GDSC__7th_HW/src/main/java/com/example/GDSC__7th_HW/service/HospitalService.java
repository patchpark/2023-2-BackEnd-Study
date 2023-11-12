package com.example.GDSC__7th_HW.service;

import com.example.GDSC__7th_HW.domain.DTO.HospitalDTO;
import com.example.GDSC__7th_HW.domain.entity.Hospital;
import com.example.GDSC__7th_HW.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public void createHospital(HospitalDTO hospitalDTO) {
        hospitalRepository.save(new Hospital(hospitalDTO.getName()));
    }


    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

}
