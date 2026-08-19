package flight_Booking_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight_Booking_App.Entity.Flight;
@Repository
public interface Fight_Repository extends JpaRepository<Flight, Integer> {

}
