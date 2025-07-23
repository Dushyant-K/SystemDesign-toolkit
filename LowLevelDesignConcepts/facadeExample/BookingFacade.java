package facadeExample;

public class BookingFacade {

	public void createBooking(User user) {
		ticketSystem ts = new ticketSystem();
		paymentSystem ps = new paymentSystem();
		NotificationSystem ns = new NotificationSystem();
		
		boolean isBookingPossible=ts.validateAvailability("movie");
		if(isBookingPossible) {
			ts.createTicket(100,user,"movie");
			ps.chargeCard();
			ns.sendEmail(user,ts.getTicketNumber());
			ns.sendSms(user,ts.getTicketNumber());
		}
	}
	
}
