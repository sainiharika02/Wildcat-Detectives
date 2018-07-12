<%@ page import="com.cb.beans.AddAgencyBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


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
<title>Case Details</title>
</head>

<style>
body {
	background-image: url('image1s/11.jpg');
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}

input[type=text],select {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 10%;
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

li a,.dropbtn {
	display: inline-block;
	color: white;
	text-align: center;
	padding: 14px 16px;
}

li a:hover,.dropdown:hover .dropbtn {
	background-color: cyan;
}

li.dropdown {
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #f1f1f1
}

.dropdown:hover .dropdown-content {
	display: block;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	text-decoration: none;
}
</style>



<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<center>

				<a href="HomePage.jsp"> <img src="images/13.jpg"
					alt="HTML tutorial" style="width: 45px; height: 45px;"></a>
			</center>
			<a class="navbar-brand" style="color: pink;" href="HomePage.jsp"><b><h3>WILDCAT
						Detective</h3></b></a>


		</div>

		<br>
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
					<li><a href="AddNewCase.jsp"> Add New Case</a></li>
					<li><a href="ExistingCase.jsp">Existing Case</a></li>
				</ul></li>

		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/WildcatDetectives/Logout" style="margin-right: 20px;"><span
					class="glyphicon glyphicon-log-in"></span>
					<h4>LogOut</h4></a></li>
		</ul>
	</nav>
	<%!AddAgencyBean ab;%>

	<%
		ab = (AddAgencyBean) request.getAttribute("agency");
	%>

	<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/project" user="root" password="root" />



	<form method="post">
		<tr>
			<div class="form-group">

				<center>
					<td><label for="Email">Email</label></td>
					<td><input type=text class="form-control" id="Email"
						placeholder="" name="Email"></td>
				</center>
			</div>
			<%
				session.setAttribute("Email", request.getParameter("Email"));
			%>

			<center>
				<tr>
					<td><input type="submit" value=Show></input></td>
				</tr>
			</center>

			</table>
	</form>


	<sql:query dataSource="${dbsource}" var="result">
            SELECT * from caseinfo where Email = "<%=session.getAttribute("Email")%>";
        </sql:query>

	<center>
		<form>
			<table class="table-responsive table-striped table-bordered"
				border="" width="60%">
				<thead class="thead">
					<tr height="10%">
						<th>CaseID</th>
						<th>Email</th>
						<th>CaseType</th>
						<th>CaseRegDate</th>
						<th>Evidences</th>
						<th>Agent_Email</th>
						<th>CaseStatus</th>
					</tr>
				</thead>
				<c:forEach var="row" items="${result.rows}">
					<tr>
						<td width="20%"><c:out value="${row.CaseID}" />
						<td width="20%"><c:out value="${row.Email}" />
						<td width="20%"><c:out value="${row.CaseType}" />
						<td width="20%"><c:out value="${row.CaseRegDate}" />
						<td width="20%"><c:out value="${row.Evidences}" />
						<td width="30%"><c:out value="${row.Agent_Email}" />
						<td width="20%"><c:out value="${row.CaseStatus}" />
					</tr>
				</c:forEach>
			</table>
		</form>
	</center>

</body>
</html>