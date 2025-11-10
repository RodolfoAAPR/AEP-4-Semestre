package com.AEP.MedicaFacil.controller;

import com.AEP.MedicaFacil.model.Medication;
import com.AEP.MedicaFacil.model.Schedule;
import com.AEP.MedicaFacil.model.User;
import com.AEP.MedicaFacil.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public ResponseEntity<List<Schedule>> getAllSchedules() {
        return ResponseEntity.ok(scheduleService.findAllSchedules());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getScheduleById(@PathVariable Long id) {
        return ResponseEntity.ok(scheduleService.findScheduleById(id));
    }

    @PostMapping("/user/{userId}/medication/{medicationId}")
    public ResponseEntity<Schedule> createSchedule(@PathVariable Long userId, @PathVariable Long medicationId, @RequestBody Schedule schedule) {
        User user = new User();
        user.setId(userId);

        Medication medication = new Medication();
        medication.setIdMedication(medicationId);

        schedule.setUser(user);
        schedule.setMedication(medication);

        return ResponseEntity.ok(scheduleService.registerSchedule(schedule));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Schedule> updateSchedule(@PathVariable Long id, @RequestBody Schedule schedule) {
        // Para a atualização, esperamos que o JSON completo seja enviado, incluindo user e medication.
        return ResponseEntity.ok(scheduleService.updateSchedule(schedule, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}
