package facadeExample;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Dushyant", "Dushyantverma.cs11@gmail.com", "9653076422");
		
//		ticketSystem ts = new ticketSystem();
//		boolean isBookingPossible = ts.validateAvailability("movie");
//		if(isBookingPossible) {
//			ts.createTicket(100,user,"movie");
//			
//			paymentSystem ps = new paymentSystem();
//			ps.chargeCard();
//			
//			NotificationSystem ns = new NotificationSystem();
//			ns.sendEmail(user,ts.getTicketNumber());
//			ns.sendSms(user,ts.getTicketNumber());
//		}
		
		BookingFacade bookingFacade = new BookingFacade();
		bookingFacade.createBooking(user);
	}

}
