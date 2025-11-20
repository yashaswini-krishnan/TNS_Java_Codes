package oops;
class device{
	void deviceType() {
		System.out.println("i am electronic device" );
	}
}
class phone extends device{
	void brand() {
		System.out.println("Brand: samsung" );
	}
}
class smartphone extends phone{
	void features() {
		System.out.println("features: touchscreen, water resistant" );
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		smartphone obj = new smartphone();
		obj.features();
		obj.deviceType();
		obj.brand();

	}

}
