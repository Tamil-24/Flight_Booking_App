package flight_Booking_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight_Booking_App.Entity.Payment;

@Repository
public interface Payment_Repository extends JpaRepository<Payment, Integer> {

}
