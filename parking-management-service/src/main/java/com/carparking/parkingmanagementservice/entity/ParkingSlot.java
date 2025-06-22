package com.carparking.parkingmanagementservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ParkingSlot {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;
    private String location;
    private String slotNumber;
    private Boolean isAvailable;
    private Long bookedByUser;
    private LocalDateTime bookingTime;
	
    public ParkingSlot(Long slotId, String location, String slotNumber, Boolean isAvailable, Long bookedByUser,
			LocalDateTime bookingTime) {
		
		this.slotId = slotId;
		this.location = location;
		this.slotNumber = slotNumber;
		this.isAvailable = isAvailable;
		this.bookedByUser = bookedByUser;
		this.bookingTime = bookingTime;
		
	}

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Long getBookedByUser() {
		return bookedByUser;
	}

	public void setBookedByUser(Long bookedByUser) {
		this.bookedByUser = bookedByUser;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	@Override
	public String toString() {
		return "ParkingSlot [slotId=" + slotId + ", location=" + location + ", slotNumber=" + slotNumber
				+ ", isAvailable=" + isAvailable + ", bookedByUser=" + bookedByUser + ", bookingTime=" + bookingTime
				+ "]";
	}
    
}