package com.AEP.MedicaFacil.service;

import com.AEP.MedicaFacil.model.User;
import com.AEP.MedicaFacil.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com o ID: " + id + " não encontrado"));
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user){
        User newUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com o ID: " + id + " não encontrtado"));

        newUser.setName(user.getName());
        newUser.setUserType(user.getUserType());
        newUser.setEmail(user.getEmail());

        return userRepository.save(newUser);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
