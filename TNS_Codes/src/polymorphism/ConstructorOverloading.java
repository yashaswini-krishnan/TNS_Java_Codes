package polymorphism;

class Student
{
	String name;
	int age;
	
	Student()
	{
	System.out.println("Default constructor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name: " + name);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name: " + name + " Age: " + age);
	}
	}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("yashaswini");
		Student s3 = new Student("yashaswini",21);

	}

}
