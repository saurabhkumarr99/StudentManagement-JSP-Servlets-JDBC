<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="POJO_Classes.Student"%>
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
<a href="http://localhost:8484/StudentManagement-JSP-Servlets-JDBC/RegisterStudent.jsp" target="blank">Register Student</a>
<a href="http://localhost:8484/StudentManagement-JSP-Servlets-JDBC/AllStudent.jsp" target="blank">All Student</a>

</nav>
</header>

<section>

<h2>Update Student</h2>
<%Student student =(Student)request.getAttribute("Student");%>

  <div class="box">
     <form action="UpdateDeleteStudent" method="post">
     <input type="hidden"  name="id" value=<%=student.getId() %>> <br>
      Student Name : <input type="text"  name="Student_name" value=<%=student.getStudentName()%> ><br>
      Father Name : <input type="text"  name="Father_name" value=<%=student.getFatherName()%> ><br>
      Mother Name : <input type="text"  name="Mother_name" value=<%=student.getMotherName()%> ><br>
      Gender : <input type="radio"  name="gender" value="Male">Male
               <input type="radio"  name="gender" value="Female">Female<br>
      Age : <input type="number"  name="age" value=<%=student.getAge()%> ><br>
      Address : <input type="text"  name="address" value=<%=student.getAddress()%> ><br>
      <button type="submit" name="btn" value="updateData">Update Student</button>
     </form>
   </div>

</section>

<footer></footer>

</body>
</html>