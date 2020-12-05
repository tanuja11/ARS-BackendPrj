package com.quinnox.airlinemanagementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.airlinemanagementsystem.dao.BookTicketsDAO;
import com.quinnox.airlinemanagementsystem.entities.BookTickets;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookTicketsController {
	
	@Autowired
	BookTicketsDAO dao;
	
	@PostMapping("/addticket")
	public BookTickets addTicket(@RequestBody BookTickets booktickets) {
		dao.addTicket(booktickets);
		return booktickets;
		
	}
	
	
	@GetMapping("/alltickets")
	public List<BookTickets> findAllTickets(){
		return dao.findAllTickets();
		
	}
	
	@PutMapping("/updateticket")
	public BookTickets updateTicket(@RequestBody BookTickets booktickets) {
		dao.updateTickets(booktickets);
		return booktickets;
		
	}
	
	@GetMapping("/ticketbyid")
	public BookTickets getTicketById(int ticketId ){
		return dao.getTicketById(ticketId);		
	}
	
	
	@DeleteMapping("/deleteticket")
	public String deleteTicket(int ticketId ) {
		dao.deleteTicket(ticketId);
		return "deleted";
		
	}
	
	
	
	

}
