package constructor;

class User1
{
	String name;
	int age;
	
	User1() //default constructor
	{
		
	}
	User1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("User_created:" + name + " Age:" + age);
	}
	void show() {
		System.out.println("name:" + name + " age:" + age);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default constructor
		User1 usr = new User1();
		usr.show();
		
		//parameterized constructor
		User1 usr1 = new User1("Yashaswini", 21);

	}

}
