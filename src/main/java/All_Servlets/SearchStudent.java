package All_Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import POJO_Classes.Student;
import dao.StudentRegister;

@WebServlet("/SearchStudent")
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id=Integer.valueOf(request.getParameter("id"));
		Student st=StudentRegister.searchStudent(id);
		
		ArrayList<Student> allStudents =new ArrayList<>();
		allStudents.add(st);
		
		RequestDispatcher rd = request.getRequestDispatcher("SearchStudent.jsp");
		request.setAttribute("Student",allStudents);
		rd.include(request, response);
	}

}
