package oops;
class Course{
		String courseName = "java";
		void showCourse() {
			System.out.println(" Course:" + courseName);
		}
	}
	
	class Student extends Course{
		String studentName="ali";
		void showStudent() {
			System.out.println(" Student:" + studentName);
		}
	}
	public class SingleLevelDemo {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.showCourse();
		obj.showStudent();

	}

}
