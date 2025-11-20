package keywords;
class Person
{
	
}
class Employee extends Person
{
	//person
	//employee
}
class Manager extends Employee
{
	//manager
	//employee
	//person
}
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Employee emp = new Employee();
		Manager manager = new Manager();
		System.out.println(emp instanceof Manager );

	}

}
