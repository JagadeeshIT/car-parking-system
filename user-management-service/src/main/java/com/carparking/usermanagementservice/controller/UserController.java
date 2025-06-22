package com.carparking.usermanagementservice.controller;

import com.carparking.usermanagementservice.entity.User;
import com.carparking.usermanagementservice.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")

public class UserController {
	

    @Autowired
    private UserServiceImplementation service;
    

    @PostMapping("/register")
    public ResponseEntity<User> userRegistration(@RequestBody User user) {
        return ResponseEntity.ok(service.userRegistration(user));
    }

    @GetMapping("/{userId}")
    public User getUserByUserId(@PathVariable Long userId) {
        return service.getUserByUserId(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<User> editUser(@PathVariable Long id, @RequestBody User updatedUser) {
        return ResponseEntity.ok(service.editUser(id, updatedUser));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
    	service.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
