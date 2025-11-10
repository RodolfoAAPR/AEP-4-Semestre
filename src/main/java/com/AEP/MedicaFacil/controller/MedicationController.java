package com.AEP.MedicaFacil.controller;

import com.AEP.MedicaFacil.model.Medication;
import com.AEP.MedicaFacil.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @GetMapping
    public ResponseEntity<List<Medication>> getAllMedications() {
        return ResponseEntity.ok(medicationService.findAllMedications());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medication> getMedicationById(@PathVariable Long id) {
        return ResponseEntity.ok(medicationService.findMedicationById(id));
    }

    @PostMapping
    public ResponseEntity<Medication> createMedication(@RequestBody Medication medication) {
        return ResponseEntity.ok(medicationService.registerMedications(medication));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medication> updateMedication(@PathVariable Long id, @RequestBody Medication medication) {
        return ResponseEntity.ok(medicationService.updateMedication(medication, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long id) {
        medicationService.deleteMedication(id);
        return ResponseEntity.noContent().build();
    }
}
