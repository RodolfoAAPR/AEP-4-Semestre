package com.AEP.MedicaFacil.service;

import com.AEP.MedicaFacil.model.UserLog;
import com.AEP.MedicaFacil.repository.UserLogRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogService {

    @Autowired
    private UserLogRepository userLogRepository;

    public List<UserLog> findAllUserLogs(){
        return userLogRepository.findAll();
    }

    public UserLog findUserLogById(Long id){
        return userLogRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Registro de uso com o ID: " + id + " não encontrado."));
    }

    public UserLog registerUserLog(UserLog userLog){
        return userLogRepository.save(userLog);
    }

    public UserLog updateUserLog(UserLog userLog, Long id){
        UserLog newUserLog = userLogRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Registro de uso com o ID: " + id + " não encontrado."));

        newUserLog.setStatus(newUserLog.getStatus());
        newUserLog.setConfirmationTime(newUserLog.getConfirmationTime());

        return userLogRepository.save(newUserLog);
    }
}
