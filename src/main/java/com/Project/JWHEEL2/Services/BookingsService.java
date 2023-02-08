package com.Project.JWHEEL2.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.Project.JWHEEL2.Models.Booking;
import com.Project.JWHEEL2.Models.Client;
import com.Project.JWHEEL2.Models.Vehicle;
import com.Project.JWHEEL2.Repositories.BookingRepository;
@Service
public class BookingsService {
	@Autowired
	private BookingRepository bookingrepository;
	
	//return list of bookings
		public List<Booking> getAllBookings(){
		return bookingrepository.findAll();
	}
		
	//save new booking
	public void save(Booking booking) {
		bookingrepository.save(booking);
	}


	//get booking by id
	public Optional<Booking> getBbyid (int id) {
		return bookingrepository.findById(id);
	}
	
	//delete new client
	public void delete(int id) {
		bookingrepository.deleteById(id);
	}
	
}