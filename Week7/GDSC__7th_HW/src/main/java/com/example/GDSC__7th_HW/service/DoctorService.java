package com.example.GDSC__7th_HW.service;

import com.example.GDSC__7th_HW.domain.DTO.DoctorDTO;
import com.example.GDSC__7th_HW.domain.DTO.HospitalDTO;
import com.example.GDSC__7th_HW.domain.DTO.MedicalDepartmentDTO;
import com.example.GDSC__7th_HW.domain.entity.Doctor;
import com.example.GDSC__7th_HW.domain.entity.Hospital;
import com.example.GDSC__7th_HW.domain.entity.MedicalDepartment;
import com.example.GDSC__7th_HW.repository.DoctorRepository;
import com.example.GDSC__7th_HW.repository.HospitalRepository;
import com.example.GDSC__7th_HW.repository.MedicalDepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;
    private final MedicalDepartmentRepository medicalDepartmentRepository;

    public void createDoctor(DoctorDTO doctorDTO) {
        MedicalDepartment medicalDepartment = medicalDepartmentRepository.findById(doctorDTO.getMedicalDepartmentId())
                .orElseThrow(RuntimeException::new);
        doctorRepository.save(new Doctor(doctorDTO.getName(), medicalDepartment));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
