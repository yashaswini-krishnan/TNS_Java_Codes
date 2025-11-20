package oops;

class Courses {
	void showCourse() {
		System.out.println("Course: java");
	}
}
class Students extends Courses {
	void showStudent() {
		System.out.println("Student Name: ali");
	}
}
class trainer extends Courses {
	void showTrainer() {
		System.out.println("Trainer Name: arya");
	}
}

public class HierarchicalDemo {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.showStudent();
		obj.showCourse();
		
		trainer obj1 = new trainer();
		obj1.showTrainer();
		obj1.showCourse();


	}

}
