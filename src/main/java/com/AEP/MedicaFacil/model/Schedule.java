package com.AEP.MedicaFacil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "agendamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSchedule;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "medication_id", nullable = false)
    private Medication medication;

    private String dosage;

    private LocalTime time; // Hora do dia para tomar o medicamento

    private String frequency; // Ex: "A cada 8 horas", "Diariamente"

    private LocalDate startDate; // Data de início do tratamento

    private LocalDate finishDate; // Data de fim do tratamento
}
