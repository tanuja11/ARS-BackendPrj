package com.quinnox.airlinemanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="userr")
public class Userr {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int uId;
	private String emailId;
	private String userName;
	private String password;
	private String gender;
	private long mobile;
	private String address;

	
	
	
	public Userr(int uId, String emailId, String userName, String password, String gender, long mobile,
			String address) {
		super();
		this.uId = uId;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
		this.address = address;
	}




	public Userr() {
		
	}

}
