package com.carparking.parkingmanagementservice.service;

import com.carparking.parkingmanagementservice.feign.UserClient;
import com.carparking.parkingmanagementservice.repository.ParkingSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ParkingService {

    @Autowired
    private ParkingSlotRepository repository;

    @Autowired
    private UserClient userClient;

   
}
