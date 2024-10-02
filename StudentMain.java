package ASSIGNMENT50;

public class StudentMain {
	public static void main(String[] args) {

		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(); // Create a new Student object

			if (i % 2 == 0) {

				students[i].setInfo("Student" + (i + 1), 20 + i);
			} else {

				students[i].setInfo("Student" + (i + 1), 20 + i, "Address" + (i + 1));
			}
		}

		System.out.println("Student Details:");
		for (Student student : students) {
			student.printInfo();
		}
	}
}