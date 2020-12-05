package com.quinnox.airlinemanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String emailId;
	private String userName;
	private String password;
	
	public Admin() {

	
	}
	
	
	
	public Admin(int id, String emailId, String userName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}





	
	
	
	
	

	
	
	
	
	
	

}
