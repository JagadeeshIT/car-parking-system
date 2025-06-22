package com.carparking.usermanagementservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carparking.usermanagementservice.entity.User;
import com.carparking.usermanagementservice.repository.UserRepository;


@Service
public class UserServiceImplementation implements UserService {

	
    @Autowired
    private UserRepository repository;

    @Override
    public User userRegistration(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserByUserId(Long userId) {
    	 return repository.findById(userId)
    	            .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User editUser(Long id, User user) {
        User existing = getUserByUserId(id);
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setMobileNumber(user.getMobileNumber());
        existing.setVehicleNumber(user.getVehicleNumber());
        return repository.save(existing);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }


}
