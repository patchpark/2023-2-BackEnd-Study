package com.example.GDSC__7th_HW.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String time;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    public Reservation(String time, Patient patient, Doctor doctor){
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }
}
