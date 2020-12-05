package com.quinnox.airlinemanagementsystem.dao;

import java.util.List;

import com.quinnox.airlinemanagementsystem.entities.BookTickets;

public interface BookTicketsDAO {

	public BookTickets addTicket(BookTickets booktickets);
	
	public List<BookTickets> findAllTickets();
	
	public BookTickets updateTickets(BookTickets booktickets);
	
	public BookTickets getTicketById(int ticketId);
	
	public boolean deleteTicket(int ticketId);
	
	
}
