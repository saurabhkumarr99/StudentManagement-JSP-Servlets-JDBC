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

@WebServlet("/UpdateDeleteStudent")
public class UpdateDeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String req =request.getParameter("btn");
		int id =Integer.valueOf(request.getParameter("id"));
		
		if(req.equals("update")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("UpdateStudent.jsp");
			Student student =StudentRegister.searchStudent(id);
//			System.out.println(student);
			request.setAttribute("Student", student);
			rd.include(request, response);
			
		}else if(req.equals("updateData")){
			
			int student_ID = Integer.valueOf(request.getParameter("id"));
			String student_name = request.getParameter("Student_name");
			String father_name = request.getParameter("Father_name");
			String mother_name = request.getParameter("Mother_name");
			String gender = request.getParameter("gender");
			int age = Integer.valueOf(request.getParameter("age"));
			String address = request.getParameter("address");
		
			Student updatedStudent = new Student(student_ID,student_name,father_name,mother_name,gender,age,address);
			StudentRegister.update(updatedStudent);

			RequestDispatcher rd = request.getRequestDispatcher("AllStudent.jsp");
			rd.forward(request, response);
			
		}else {
			
			StudentRegister.delete(id);
			RequestDispatcher rd = request.getRequestDispatcher("AllStudent.jsp");
			rd.forward(request, response);
		}
	
	}

}
