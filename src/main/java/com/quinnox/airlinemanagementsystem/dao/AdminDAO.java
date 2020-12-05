package com.quinnox.airlinemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.airlinemanagementsystem.entities.Admin;

public interface AdminDAO extends JpaRepository<Admin, Integer> {
	
public Admin findByEmailId(String emailId);
	
	public Admin findByEmailIdAndPassword(String email, String password);

}
