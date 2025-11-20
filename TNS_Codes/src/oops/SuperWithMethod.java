package oops;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}

class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processsing payment via google pay");
	}
	
	void completeTransaction()
	{
		process();
		super.process();
	}
}
public class SuperWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPay obj = new GPay();
		obj.completeTransaction();
		

	}

}
