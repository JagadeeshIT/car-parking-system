package com.carparking.usermanagementservice.service;

import java.util.List;

import com.carparking.usermanagementservice.entity.User;

public interface UserService {

	User userRegistration(User user);

    User getUserByUserId(Long userId);

    List<User> getAllUsers();

    User editUser(Long id, User user);

    void deleteUser(Long id);
	
}
