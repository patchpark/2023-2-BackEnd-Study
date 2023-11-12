package com.example.GDSC__7th_HW.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MedicalDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @ManyToOne
    private Hospital hospital;

    public MedicalDepartment(Hospital hospital, String name){
        this.hospital = hospital;
        this.name = name;
    }
}
