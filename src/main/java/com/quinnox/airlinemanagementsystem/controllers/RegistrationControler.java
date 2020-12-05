package com.quinnox.airlinemanagementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.airlinemanagementsystem.dao.RegistrationDAo;
import com.quinnox.airlinemanagementsystem.entities.FlightDetails;
import com.quinnox.airlinemanagementsystem.entities.Userr;
import com.quinnox.airlinemanagementsystem.service.RegistrationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegistrationControler {
	
	@Autowired
	private RegistrationDAo dao;
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	public Userr registerUser(@RequestBody Userr user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId  != null && !"".equals(tempEmailId)) {
			Userr userobj= service.fetchUserByEmailId(tempEmailId);
			if(userobj != null) {
				throw new Exception("User with "+tempEmailId+ "  id is alredy present");
			}
		}
		Userr userobj = null;
		userobj=service.saveUser(user);
		
		return userobj;
		
	}	
	
	
	@PostMapping("/login")
	public Userr loginUser(@RequestBody Userr user) throws Exception {
		
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		Userr userobj = null;
		if(tempEmailId != null && tempPass != null) {
			userobj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		if(userobj == null) {
			throw new Exception("bad credentials");
		}
		return userobj;
		
	}	
	
	
	@GetMapping("/allusers")
	public List<Userr> findAllUsers(){
		List<Userr> user= dao.findAll();
		return user;
	
		}
	
	

}
