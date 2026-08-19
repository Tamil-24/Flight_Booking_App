package flight_Booking_App.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
	
	private Integer Statuscode;
	private String message;
	private T Data;
	

}
