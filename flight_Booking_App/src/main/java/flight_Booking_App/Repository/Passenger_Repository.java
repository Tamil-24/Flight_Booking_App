package flight_Booking_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight_Booking_App.Entity.Passenger;


@Repository
public interface Passenger_Repository extends JpaRepository<Passenger, Integer> {

}
