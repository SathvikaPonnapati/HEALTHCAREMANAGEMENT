package com.cognizant.healthcare.DTO;

import lombok.Data;

@Data
public class DoctorDTO {
	
	
	    private Long doctorID;
	    private UserDTO user;
	    private String qualification;
	    private String specialization;
	    private int experienceYears;
	    private String status; // e.g., "Active" or "Inactive"

	    // Getters and setters
	


}
