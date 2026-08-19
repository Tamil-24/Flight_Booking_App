package flight_Booking_App.Global_Exception_Handler;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import flight_Booking_App.Dto.ResponseStructure;

@ControllerAdvice
public class Global_Exception_Handler {
	
	@ExceptionHandler(Booking_Id_Not_Found_Exception.class)
	public ResponseEntity<ResponseStructure<String>>Booking_Id_Not_Found_Exception(Booking_Id_Not_Found_Exception bo){
		ResponseStructure<String> rs=new ResponseStructure<>();
		rs.setStatuscode(HttpStatus.OK.value());
		rs.setMessage(bo.getMessage());
		rs.setData("Booking data is not present in the database.");
		return new ResponseEntity<>(rs,HttpStatus.OK);	
	}
	@ExceptionHandler(Flight_Not_Found_Exception.class)
	public ResponseEntity<ResponseStructure<String>>Flight_Not_Found_Exception(Flight_Not_Found_Exception fl){
		ResponseStructure<String> rs=new ResponseStructure<>();
		rs.setStatuscode(HttpStatus.OK.value());
		rs.setMessage(fl.getMessage());
		rs.setData("Booking data is not present in the database.");
		return new ResponseEntity<>(rs,HttpStatus.OK);	
	}
	@ExceptionHandler(Passenger_Not_Found_Exception.class)
	public ResponseEntity<ResponseStructure<String>>Passenger_Not_Found_Exception(Passenger_Not_Found_Exception ps){
		ResponseStructure<String> rs=new ResponseStructure<>();
		rs.setStatuscode(HttpStatus.OK.value());
		rs.setMessage(ps.getMessage());
		rs.setData("Booking data is not present in the database.");
		return new ResponseEntity<>(rs,HttpStatus.OK);	
	}
	@ExceptionHandler(Payment_Details_Not_Found_Exception.class)
	public ResponseEntity<ResponseStructure<String>>Payment_Details_Not_Found_Exception(Payment_Details_Not_Found_Exception pay){
		ResponseStructure<String> rs=new ResponseStructure<>();
		rs.setStatuscode(HttpStatus.OK.value());
		rs.setMessage(pay.getMessage());
		rs.setData("Booking data is not present in the database.");
		return new ResponseEntity<>(rs,HttpStatus.OK);	
	}

}
