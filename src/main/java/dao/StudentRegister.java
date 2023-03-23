package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database_Connector.ConnectionProvider;
import POJO_Classes.Student;

public class StudentRegister {

	static Connection connection = ConnectionProvider.getConnection();

	/*
	 * *****************************************************************************
	 * ********************************************************************** Create
	 * -Register new Student
	 */
	public static void register(Student student) {

		String query = "insert into student(studentId, studentName, fatherName, motherName, gender, age, address) values(?,?,?,?,?,?,?)";

		try {

			// Get PreparedStatement object
			PreparedStatement pstmt = connection.prepareStatement(query);

			// Set values to query
			pstmt.setInt(1, student.getId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getFatherName());
			pstmt.setString(4, student.getMotherName());
			pstmt.setString(5, student.getGender());
			pstmt.setInt(6, student.getAge());
			pstmt.setString(7, student.getAddress());

			// Execute query
			int res = pstmt.executeUpdate();
			if (res >= 1) {
				System.out.println("Student added successfully");
			} else {
				System.out.println("Error");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * *****************************************************************************
	 * ********************************************************************** Update
	 * -Update Student
	 */

	public static void update(Student student) {
		
		String query = "update  student  set studentName =?, fatherName =?, motherName =?, gender =?, age =?, address=? where studentId =?";

		try {

			// Get PreparedStatement object
			PreparedStatement pstmt = connection.prepareStatement(query);

			// Set values to query
			pstmt.setInt(7, student.getId());
			pstmt.setString(1, student.getStudentName());
			pstmt.setString(2, student.getFatherName());
			pstmt.setString(3, student.getMotherName());
			pstmt.setString(4, student.getGender());
			pstmt.setInt(5, student.getAge());
			pstmt.setString(6, student.getAddress());

			// Execute query
			int res = pstmt.executeUpdate();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	/*
	 * *****************************************************************************
	 * ********************************************************************** Read
	 * -Read/Get all Students
	 */
	public static ArrayList<Student> AllStudent() {

		String query = "select * from student";
		ArrayList<Student> allStudents = new ArrayList<Student>();

		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String studentName = rs.getString(2);
				String fatherName = rs.getString(3);
				String motherName = rs.getString(4);
				String gender = rs.getString(5);
				int age = rs.getInt(6);
				String address = rs.getString(7);

				Student student = new Student(id, studentName, fatherName, motherName, gender, age, address);
				// System.out.println(student);
				allStudents.add(student);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allStudents;
	}

	/*
	 * *****************************************************************************
	 * ********************************************************************** Delete
	 * -Delete Student
	 */

	public static void delete(int id) {
		String query = "delete from student where studentId =(?)";

		try {

			// Get PreparedStatement object
			PreparedStatement pstmt = connection.prepareStatement(query);

			// Set values to query
			pstmt.setInt(1, id);

			// Execute query
			int res = pstmt.executeUpdate();
			if (res >= 1) {
				System.out.println("Student deleted successfully");
			} else {
				System.out.println("Error");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * *****************************************************************************
	 * ********************************************************************** Read
	 * -Search = Search Students
	 */
	public static Student searchStudent(int Studentid) {

		String query = "SELECT * FROM student where studentId =" + Studentid;
		Student student = new Student();
		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String studentName = rs.getString(2);
				String fatherName = rs.getString(3);
				String motherName = rs.getString(4);
				String gender = rs.getString(5);
				int age = rs.getInt(6);
				String address = rs.getString(7);

				 student = new Student(id, studentName, fatherName, motherName, gender, age, address);
				// System.out.println(student);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}
}
