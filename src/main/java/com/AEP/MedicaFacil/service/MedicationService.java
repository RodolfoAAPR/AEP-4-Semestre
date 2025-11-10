package com.AEP.MedicaFacil.service;

import com.AEP.MedicaFacil.model.Medication;
import com.AEP.MedicaFacil.repository.MedicationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    public List<Medication> findAllMedications(){
        return medicationRepository.findAll();
    }

    public Medication findMedicationById(Long id){
        return medicationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("A medicação com o ID: " + id + " não foi encontrada."));
    }

    public Medication registerMedications(Medication medication){
        return medicationRepository.save(medication);
    }

    public Medication updateMedication(Medication medication, Long id) {
        Medication newMedication = medicationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("A medicação com o ID: \" + id + \" não foi encontrada."));

        newMedication.setMedicationName(medication.getMedicationName());
        newMedication.setDescription(newMedication.getDescription());

        return medicationRepository.save(newMedication);
    }

    public void deleteMedication(Long id){
        medicationRepository.deleteById(id);
    }
}
