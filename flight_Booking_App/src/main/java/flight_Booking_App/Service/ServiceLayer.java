package flight_Booking_App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight_Booking_App.Repository.Booking_Repository;
import flight_Booking_App.Repository.Fight_Repository;
import flight_Booking_App.Repository.Passenger_Repository;
import flight_Booking_App.Repository.Payment_Repository;

@Service
public class ServiceLayer {
	@Autowired
	Booking_Repository bookingrepo;
	@Autowired
	Fight_Repository flightrepo;
	@Autowired
	Passenger_Repository passrepo;
	@Autowired
	Payment_Repository paymrepo;
	
	
	
	
	
	
}
