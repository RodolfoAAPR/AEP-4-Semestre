package com.AEP.MedicaFacil.service;

import com.AEP.MedicaFacil.model.Schedule;
import com.AEP.MedicaFacil.repository.ScheduleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> findAllSchedules(){
        return scheduleRepository.findAll();
    }

    public Schedule findScheduleById(Long id){
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agendamento com o ID: " + id + " não encontrado!"));
    }

    public Schedule registerSchedule(Schedule schedule){
        return scheduleRepository.save(schedule);
    }

    public Schedule updateSchedule(Schedule schedule, Long id){
        Schedule newSchedule = scheduleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agendamento com o ID:" + id + " não encontrado!"));

        newSchedule.setUser(schedule.getUser());
        newSchedule.setMedication(schedule.getMedication());
        newSchedule.setDosage(schedule.getDosage());
        newSchedule.setTime(schedule.getTime());
        newSchedule.setFrequency(schedule.getFrequency());
        newSchedule.setStartDate(schedule.getStartDate());
        newSchedule.setFinishDate(schedule.getFinishDate());

        return scheduleRepository.save(newSchedule);
    }

    public void deleteSchedule(Long id){
        scheduleRepository.deleteById(id);
    }
}
