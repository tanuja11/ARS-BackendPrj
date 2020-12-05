package com.quinnox.airlinemanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.airlinemanagementsystem.entities.Userr;



public interface RegistrationDAo extends JpaRepository<Userr	, Integer> {

	
	public Userr findByEmailId(String emailId);
	
	public Userr findByEmailIdAndPassword(String email, String password);
	
	public List<Userr> findAll();

	
	
	
}
