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
@Table(name="booktickets")
public class BookTickets {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticketId")	
	private int ticketId;
	
	@Column(name="sourceCity")
	private String sourceCity;
	
	@Column(name="flightName")
	private String flightName;
	
	@Column(name="destinationCity")
	private String destinationCity;
	
	@Column(name="departureTime")
	private String departureTime;

	@Column(name="arrivalTime")
	private String arrivalTime;
	
	@Column(name="seat")
	private String seat;
	
	@Column(name="day")
	private String day;
	
	@Column(name="price")
	private int price;

	

	
	
	public BookTickets() {
		
	}





	public BookTickets(int ticketId, String sourceCity, String destinationCity, String departureTime,
			String arrivalTime, String seat, String day, int price) {
		super();
		this.ticketId = ticketId;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seat = seat;
		this.day = day;
		this.price = price;
	}




	
	
	
	





	
	

}
