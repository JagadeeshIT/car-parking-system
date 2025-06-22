package com.carparking.parkingmanagementservice.controller;

import com.carparking.parkingmanagementservice.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    @Autowired
    private ParkingService service;

}
