package flight_Booking_App.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	@CreationTimestamp
	private LocalDateTime paymentDateAndTime;
	private Double amount;
	private ModeOfPayment ModeOfPay;
	private PaymentStatus PayStatus;
	
	@OneToOne(mappedBy = "payment")
	private Booking booking;

}
