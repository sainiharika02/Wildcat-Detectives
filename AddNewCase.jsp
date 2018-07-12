<%@ page import="com.cb.beans.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>AddNewcase</title>
</head>
<%!RegistrationBean r;%>

<%
	r = (RegistrationBean) session.getAttribute("user");
%>
<style>
body {
	background-image: url('images/11.jpg');
}

input[type=text], input[type=date], select {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 50%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

h1 {
	color: white;
}

div {
	margin-top: 20px;
	margin-left: 200px;
	margin-right: 200px;
	background-color: #f2f2f2;
	padding: 5px;
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}
</style>
<body>
	<nav class="navbar navbar-inverse"> <div1 class="container-fluid">
	<div1 class="navbar-header">
	<center>

		<a href="HomePage.jsp"> <img src="images/13.jpg"
			alt="HTML tutorial" style="width: 45px; height: 45px;"></a>
	</center>
	<a class="navbar-brand" style="color: pink;" href="HomePage.jsp"><b><h3>WILDCAT
				Detective</h3></b></a> </div1> <br>
	<center>
		<ul class="nav navbar-nav">
			<li class="active"><a href="HomePage.jsp"><h4>Home</h4></a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"><h4>Services</h4> <span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Personal Services</a></li>
					<li><a href="#">Corporate Services</a></li>
					<li><a href="#">Financial Services</a></li>
					<li><a href="#">Legal Services</a></li>
				</ul></li>
			<li><a href="AboutUs.jsp"><h4>AboutUs</h4></a></li>
			<li><a href="ContactUs.jsp"><h4>ContactUs</h4></a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"><h4>Cases</h4> <span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="NewCase.jsp"> Add New Case</a></li>
					<li><a href="ExistingCase.jsp">Existing Case</a></li>
				</ul></li>

		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/MiniProject/Logout" style="margin-right: 20px;"><span
					class="glyphicon glyphicon-log-in"></span>
					<h4>LogOut</h4></a></li>
		</ul>
	</div1> </nav>
	<center>
		<h1 color="white">
			<b>CASE DETAILS 
		</h1>
		</b>
		<div>
			<form method="post" action="AddNewCaseServlet">
				<label for="fname">Customer_Email</label> <input type="text" name="Email" value="<%=r.getEmail()%>"readonly"> <br>
				<label for="lname">CaseType</label> <input type="text" name="CaseType" placeholder="Your CaseType.." required> <br>
				<label for="fname">CaseRegDate</label> <input type="date" name="CaseRegDate" placeholder="CaseRegDate.." required> <br>
				<label for="fname">Evidences</label> <input type="text" name="Evidences" placeholder="Your Evidences" required> <br>
				</select> <input type="submit" value="Submit">
			</form>
		</div>
	</center>

</body>
</html>