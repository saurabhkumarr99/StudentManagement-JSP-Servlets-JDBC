package POJO_Classes;

import dao.StudentRegister;

public class Run {

	public static void main(String[] args) {

		StudentRegister studentRegister = new StudentRegister();

		// Register new Student
		Student student = new Student(2, "Student2", "Father2", "Mother2", "Female", 17, "Address2");
		//studentRegister.register(student);
		System.out.println(studentRegister.AllStudent());
		System.out.println(studentRegister.searchStudent(2));
		//studentRegister.delete(5);
	}
}
