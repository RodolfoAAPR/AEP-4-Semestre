package com.AEP.MedicaFacil.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idSchedule;

    private String dosage;

    private LocalTime time;

    private String frequency;

    private LocalTime startDate;

    private LocalTime finishDate;
}
