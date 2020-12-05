package com.quinnox.airlinemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.airlinemanagementsystem.entities.BookTickets;

@Repository
public class BookTicketsDAOImpl implements BookTicketsDAO   {
	

	@Autowired
	EntityManager manager;

	
	@Transactional
	@Override
	public BookTickets addTicket(BookTickets booktickets) {
		
		manager.persist(booktickets);
		return booktickets;
	}

	
	@Override
	public List<BookTickets> findAllTickets() {
		TypedQuery<BookTickets> query=manager.createQuery("from BookTickets", BookTickets.class);
		return query.getResultList();
	}
	
	

	@Override
	@Transactional
	public BookTickets updateTickets(BookTickets booktickets) {

		BookTickets bookTickets2 =manager.find(BookTickets.class,booktickets.getTicketId());
		BeanUtils.copyProperties(booktickets, bookTickets2);
		return booktickets;
	}

	@Override
	@Transactional
	public boolean deleteTicket(int ticketId) {
		BookTickets booktickets=manager.find(BookTickets.class, ticketId);
		
		manager.remove(booktickets);
		
		return true;
	}


	@Override
	public BookTickets getTicketById(int ticketId) {
		BookTickets booktickets = manager.find(BookTickets.class, ticketId);
		
		return booktickets;
	}

	
	

}
