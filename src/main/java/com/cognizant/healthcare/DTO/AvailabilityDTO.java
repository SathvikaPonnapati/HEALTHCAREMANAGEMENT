package com.cognizant.healthcare.DTO;

import lombok.Data;

@Data
public class AvailabilityDTO {
    private Long availabilityID;
    private String timeslot; // e.g., "10:00 AM - 11:00 AM"
    private String availableDate; // e.g., "2025-04-08"
    private DoctorDTO doctor;

    // Getters and setters
}
