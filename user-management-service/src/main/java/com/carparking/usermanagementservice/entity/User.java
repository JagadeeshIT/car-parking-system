package com.carparking.usermanagementservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long userId;
    private String name;
    private String email;
    private String mobileNumber;
    private String vehicleNumber;
	
    public User() {}

    public User( String name, String email, String mobileNumber, String vehicleNumber) {
		
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.vehicleNumber = vehicleNumber;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", vehicleNumber=" + vehicleNumber + "]";
	}
    
    
    
    
}
