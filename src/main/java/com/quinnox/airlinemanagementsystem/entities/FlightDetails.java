package com.quinnox.airlinemanagementsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="flightdetails")
public class FlightDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fId")
	private int fId;
	
	@Column(name="flightName")
	private String flightName;
	
	@Column(name="sourceCity")
	private String sourceCity;
	
	@Column(name="destinationCity")
	private String destinationCity;
	
	@Column(name="arrivalTime")
	private String arrivalTime;
	
	@Column(name="departureTime")
	private String departureTime;
	
	@Column(name="day")
	private String day;
	
	@Column(name="seat")
	private String seat;

	@Column(name="price")
	private int price;

	
public FlightDetails() {
		
	}


	public FlightDetails(int fId, String flightName, String sourceCity, String destinationCity, String arrivalTime,
			String departureTime, String day, String seat, int price) {
		super();
		this.fId = fId;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.day = day;
		this.seat = seat;
		this.price = price;
	}

	
	
	
	
	
	
	

}
