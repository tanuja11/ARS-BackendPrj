package com.quinnox.airlinemanagementsystem.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.airlinemanagementsystem.dao.RegistrationDAo;
import com.quinnox.airlinemanagementsystem.entities.FlightDetails;
import com.quinnox.airlinemanagementsystem.entities.Userr;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAo dao;
	
	@Autowired
	EntityManager manager;
	
	

public Userr saveUser(Userr user) {
		
		return dao.save(user);
		
	}

public Userr fetchUserByEmailId(String email) {
	return dao.findByEmailId(email);
}



public Userr fetchUserByEmailIdAndPassword(String email, String password) {
	return dao.findByEmailIdAndPassword(email, password);
}



public List<Userr> findAllUsers(){
	TypedQuery<Userr> query = manager.createQuery("from User", Userr.class);
	return query.getResultList();
	
}


}
