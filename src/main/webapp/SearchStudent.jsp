<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dao.StudentRegister"%>
<%@page import="POJO_Classes.Student"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="common.css">
</head>

<body>

<header>
<h1>Student Management System</h1>
<nav>
<a href="http://localhost:8484/StudentManagement-JSP-Servlets-JDBC/RegisterStudent.jsp">Register Student</a>
<a href="http://localhost:8484/StudentManagement-JSP-Servlets-JDBC/AllStudent.jsp">All Student</a>

</nav>
</header>

<section>

<%
ArrayList<Student> allStudent =(ArrayList<Student>)request.getAttribute("Student"); 
%>
<div class="container">
<table>
       <thead>
              <tr>
                  <th>Student Id</th>
                  <th>Student Name</th>
                  <th>Father Name</th>
                  <th>Mother Name</th>
                  <th>Gender</th>
                  <th>Age</th>
                  <th>Address</th>
                  <th>Update</th>
                  <th>Delete</th>
               </tr>
       </thead>
       
       <tbody>
               <%
               for(Student student:allStudent){
               %>
               <tr>
                  <td><%= student.getId() %></td>
                  <td><%= student.getStudentName() %></td>
                  <td><%= student.getFatherName() %></td>
                  <td><%= student.getMotherName() %></td>
                  <td><%= student.getGender() %></td>
                  <td><%= student.getAge() %></td>
                  <td><%= student.getAddress() %></td>
                  
                  <form action="UpdateDeleteStudent" method="post">
                   <input type="hidden" name="id" value=<%= student.getId()%>>
                   <td><button type="submit" name="btn" value="update">Update</button></td>
                   <td><button type="submit" name="btn" value="delete">Delete</button></td>
                  </form>
                  
               </tr>
                <%}%>
               
       </tbody>
</table>
</div>


</section>

<footer></footer>

</body>
</html>