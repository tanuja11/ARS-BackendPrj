package com.quinnox.airlinemanagementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.airlinemanagementsystem.dao.AdminDAO;
import com.quinnox.airlinemanagementsystem.entities.Admin;
import com.quinnox.airlinemanagementsystem.service.AdminService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {
	
	@Autowired
	private AdminDAO dao;
	
	@Autowired
	private AdminService service;
	
	
	@PostMapping("/registeradmin")
	public Admin registerAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmailId = admin.getEmailId();
		if(tempEmailId  != null && !"".equals(tempEmailId)) {
			Admin userobj= service.fetchAdminByEmailId(tempEmailId);
			if(userobj != null) {
				throw new Exception("Admin with "+tempEmailId+ "  id is alredy present");
			}
		}
		Admin userobj = null;
		userobj=service.saveAdmin(admin);
		
		return userobj;
		
	}	
	
	
	@PostMapping("/adminlogin")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		
		String tempEmailId = admin.getEmailId();
		String tempPass = admin.getPassword();
		Admin userobj = null;
		if(tempEmailId != null && tempPass != null) {
			userobj=service.fetchAdminByEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		if(userobj == null) {
			throw new Exception("bad credentials");
		}
		return userobj;
		
	}	
	
	
	

}
