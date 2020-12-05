package com.quinnox.airlinemanagementsystem.dao;

import java.util.List;

import com.quinnox.airlinemanagementsystem.entities.FlightDetails;

public interface FlightDAO {
	
	public FlightDetails addFlight(FlightDetails flightdetails);
	
	public List<FlightDetails> findAllFlights();
	
	public boolean updateFlightDetails(FlightDetails flightdetails);
	
	public FlightDetails getFlightById(int fId);
	
	public boolean deleteFlight(int fId);
	
	

}
