package com.example.GDSC__7th_HW.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private MedicalDepartment medicalDepartment;

    public Doctor(String name, MedicalDepartment medicalDepartment){
        this.name = name;
        this.medicalDepartment = medicalDepartment;
    }
}
