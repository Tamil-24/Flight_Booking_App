package flight_Booking_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight_Booking_App.Entity.Booking;
@Repository
public interface Booking_Repository extends JpaRepository<Booking, Integer>{

}
