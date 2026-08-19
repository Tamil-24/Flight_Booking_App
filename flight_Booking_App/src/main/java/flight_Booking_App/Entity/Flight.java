	package flight_Booking_App.Entity;
	
	import java.time.LocalDateTime;
	import java.util.List;
	
	import com.fasterxml.jackson.annotation.JsonIgnore;
	
	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	
	import jakarta.persistence.OneToMany;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	
	@Entity
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class Flight {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer flightId;
		private String airline;// "IndiGo", "Air India", "Emirates"
		private String source; // "Bangalore", "Chennai", "Delhi"
		private String destination;// "Mumbai", "Hyderabad", "Dubai"
		private LocalDateTime DepartureDataAndTime;// 2026-08-20T10:30
		private LocalDateTime ArrivalDateAndTime;
		private Integer TotalSeats;
		private Integer AvailableSeats;
		private Double price;
		
	// we don't need to create table in the database it will be automatically created.
		@JsonIgnore
		@OneToMany(cascade = CascadeType.ALL,mappedBy = "flight") //mappedBy will say : i am not the foreign key "booking". the real foreign key is "flight" so consider that.
		private List<Booking> booking;
	}
