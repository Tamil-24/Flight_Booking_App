package flight_Booking_App.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	@CreationTimestamp
	private LocalDateTime bookingDateTime;
	private StatusOfBooking status;
	
	
	@ManyToOne // it becomes owning side, because @ManyToOne is consider @joincolumn i own the relationship and the foreign key is created here in the booking table
	private Flight flight;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "booking")
	private List<Passenger> passenger;
	
	@JoinColumn
	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;
}
