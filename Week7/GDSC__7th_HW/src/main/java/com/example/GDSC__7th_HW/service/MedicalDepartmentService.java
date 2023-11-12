package com.example.GDSC__7th_HW.service;

import com.example.GDSC__7th_HW.domain.entity.Hospital;
import com.example.GDSC__7th_HW.domain.entity.MedicalDepartment;
import com.example.GDSC__7th_HW.domain.DTO.MedicalDepartmentDTO;
import com.example.GDSC__7th_HW.repository.HospitalRepository;
import com.example.GDSC__7th_HW.repository.MedicalDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalDepartmentService {
    private final MedicalDepartmentRepository medicalDepartmentRepository;
    private final HospitalRepository hospitalRepository;

    public void createHospital(MedicalDepartmentDTO medicalDepartmentDTO) {
        Hospital hospital = hospitalRepository.findById(medicalDepartmentDTO.getHospitalId())
                .orElseThrow(RuntimeException::new);
        medicalDepartmentRepository.save(new MedicalDepartment(hospital, medicalDepartmentDTO.getName()));
    }

    public List<MedicalDepartment> getAllHospitals() {
        return medicalDepartmentRepository.findAll();
    }
}
