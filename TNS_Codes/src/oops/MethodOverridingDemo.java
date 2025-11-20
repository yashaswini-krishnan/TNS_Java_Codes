package oops;

class Payment //parent
{ 
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}

class UpiPayment extends Payment //sub class
{
	void makePayment()
	{
		System.out.println("Payment using UPI");
	}
}
class CardPayment extends Payment{
	void makePayment()
	{
		System.out.println("Payment using credit card");
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment;
		
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		

	}

}
