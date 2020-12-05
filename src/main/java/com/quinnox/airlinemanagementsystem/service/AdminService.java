package com.quinnox.airlinemanagementsystem.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.airlinemanagementsystem.dao.AdminDAO;
import com.quinnox.airlinemanagementsystem.entities.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO dao;
	
	@Autowired
	EntityManager manager;
	
	
public Admin saveAdmin(Admin admin) {
		
		return dao.save(admin);
		
	}

public Admin fetchAdminByEmailId(String email) {
	return dao.findByEmailId(email);
}



public Admin fetchAdminByEmailIdAndPassword(String email, String password) {
	return dao.findByEmailIdAndPassword(email, password);
}

	

}
