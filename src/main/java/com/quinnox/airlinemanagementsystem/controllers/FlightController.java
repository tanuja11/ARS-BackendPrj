package com.quinnox.airlinemanagementsystem.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.airlinemanagementsystem.dao.FlightDAO;
import com.quinnox.airlinemanagementsystem.entities.FlightDetails;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightController {
	
	@Autowired
	FlightDAO dao;
	
	@PostMapping("/addflight")
	public FlightDetails addFlight(@RequestBody FlightDetails flightdetails ) {
		
		dao.addFlight(flightdetails);
		return flightdetails;
		
	}
	
	
	@GetMapping("/allflights")
	public List<FlightDetails> findAllFlights(){
		return dao.findAllFlights();
		
	}
	
	@GetMapping("/flightbyId")
	public FlightDetails getFlightById(int fId) {
		
		return dao.getFlightById(fId);
		
		
	}
	
	@PutMapping("/updateflightinfo")
	public String updateFlightDetails(@RequestBody FlightDetails flightdetails) {
		dao.updateFlightDetails(flightdetails);
		return "updated" ;
		
	}
	
	
	
	@DeleteMapping("/deleteflight")
	public String deleteProduct(int fId) {
		dao.deleteFlight(fId);
		return "deleted";
	
	
	}
	
	
	

}
