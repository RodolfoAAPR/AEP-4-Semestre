package com.AEP.MedicaFacil.controller;

import com.AEP.MedicaFacil.model.UserLog;
import com.AEP.MedicaFacil.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

@RestController
@RequestMapping("/api/logs")
public class UserLogController {

    @Autowired
    private UserLogRepository userLogRepository;

    @PostMapping
    public ResponseEntity<UserLog> createLog(@RequestBody UserLog userLog) {
        try {
            UserLog newLog = new UserLog();

            newLog.setStatus(userLog.getStatus());
            newLog.setConfirmationTime(LocalTime.from(LocalDateTime.now()));

            UserLog savedLog = userLogRepository.save(newLog);

            return new ResponseEntity<>(savedLog, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/schedule/{scheduleId}")
    public ResponseEntity<Optional<UserLog>> getLogsBySchedule(@PathVariable Long scheduleId) {
        try {
            Optional<UserLog> logs = userLogRepository.findById(scheduleId);

            if (logs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(logs, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{logId}")
    public ResponseEntity<HttpStatus> deleteLog(@PathVariable Long logId) {
        try {
            userLogRepository.deleteById(logId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}