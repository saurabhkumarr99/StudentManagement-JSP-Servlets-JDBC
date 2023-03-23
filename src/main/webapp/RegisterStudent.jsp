<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
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


<div class="container" >
<div class="box">
<h2>Register New Student</h2>
<form action="RegisterStudent" method="post"> 
Student ID : <input type="number"  name="Student_ID"><br>
Student Name : <input type="text"  name="Student_name"><br>
Father Name : <input type="text"  name="Father_name"><br>
Mother Name : <input type="text"  name="Mother_name"><br>
Gender : <input type="radio"  name="gender" value="Male">Male
         <input type="radio"  name="gender" value="Female">Female<br>
Age : <input type="number"  name="age"><br>
Address : <input type="text"  name="address"><br>
<button type="submit">Register Student</button>
</form>
</div>

<div class="box">
<h2>Search Student</h2>
<form action="SearchStudent" method="post">
Enter id : <input type="number" name="id"><br>
<button type="submit">Search</button>
</form>
</div>
</section>

<footer></footer>
</body>
</html>