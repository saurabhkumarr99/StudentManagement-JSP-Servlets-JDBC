package All_Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import POJO_Classes.Student;
import dao.StudentRegister;

@WebServlet("/RegisterStudent")
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		int student_ID = Integer.valueOf(request.getParameter("Student_ID"));
		String student_name = request.getParameter("Student_name");
		String father_name = request.getParameter("Father_name");
		String mother_name = request.getParameter("Mother_name");
		String gender = request.getParameter("gender");
		int age = Integer.valueOf(request.getParameter("age"));
		String address = request.getParameter("address");
		
		Student student =new Student(student_ID,student_name,father_name,mother_name,gender,age,address);
		//System.out.println(student);
		
		StudentRegister.register(student);
		
		RequestDispatcher rd = request.getRequestDispatcher("AllStudent.jsp");
		rd.forward(request, response);
	}

}
