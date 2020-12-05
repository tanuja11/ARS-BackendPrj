package com.quinnox.airlinemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.airlinemanagementsystem.entities.FlightDetails;

@Repository
public class FlightDAOImpl  implements FlightDAO{
	
	@Autowired
	EntityManager manager;

	
	@Override
	@Transactional
	public FlightDetails addFlight(FlightDetails flightdetails) {

		manager.persist(flightdetails);
		return flightdetails;
	}


	@Override
	public List<FlightDetails> findAllFlights() {
		TypedQuery<FlightDetails> query = manager.createQuery("from FlightDetails", FlightDetails.class);
		return query.getResultList();
	
	}
	
	@Override
	public FlightDetails getFlightById(int fId) {
		FlightDetails flightdetails = manager.find(FlightDetails.class, fId);
		return flightdetails;
	}



	@Override
	@Transactional
	public boolean deleteFlight(int fId) {
		
		FlightDetails flightdetails = manager.find(FlightDetails.class,fId );
		manager.remove(flightdetails);


		return true;
	}

	@Transactional
	@Override
	public boolean updateFlightDetails(FlightDetails flightdetails) {
		FlightDetails flightdetails1 = manager.find(FlightDetails.class, flightdetails.getFId());
		BeanUtils.copyProperties(flightdetails, flightdetails1);
		
		return false;
	}


	

}
