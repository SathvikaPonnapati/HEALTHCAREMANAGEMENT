package com.cognizant.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.healthcare.entity.Doctor;
import com.cognizant.healthcare.entity.User;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
