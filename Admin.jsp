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
<title>ADMIN</title>
<style>
body {
	background-image: url('images/10.jpg');
}

h1,h3 {
	color: white;
}

l {
	list-style-type: none;
	padding: 0;
	width: 15%;
	background-color: #808080;
	position: fixed;
	height: 100%;
	overflow: auto;
}

li a {
	display: block;
	color: black;
	padding: 8px 16px;
	text-decoration: none;
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}
</style>
</head>

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
				<li><a href="AboutUs.jsp"><h4>AboutUs</h4></a>
				<li><a href="ContactUs.jsp"><h4>ContactUs</h4></a>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/WildcatDetectives/Logout" style="margin-right: 20px;"><span
						class="glyphicon glyphicon-log-in"></span>
						<h4>LogOut</h4></a></li>
			</ul>
	</div>

	</nav>


	<l>
	<center>
		<li><a href="AddAgent.jsp">Add Agent</a></li>
		<li><a href="RemoveAgent.jsp">Remove Agent</a></li>
		<li><a href="UpdateAgent.jsp">Update Agent</a></li>
		<li><a href="/WildcatDetectives/AssignServlet">Assign Cases</a></li>
	</center>
	</l>
	<h1>
		<center>WELCOME ADMIN</center>
	</h1>
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>

	<%
		String Firstname = request.getParameter("Firstname");
		String Lastname = request.getParameter("Lastname");
		String Email = request.getParameter("Email");
		String ContactNo = request.getParameter("ContactNo");
		String Address = request.getParameter("Address");
		String Gender = request.getParameter("Gender");
		String driverName = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost:3306/";
		String dbName = "project";
		String userId = "root";
		String password = "root";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	%>
	<br>
	<br>
	<center>
		<h3 style="color: cyan;">Agents:</h3>
	</center>
	<table align="center" cellpadding="10" cellspacing="10" border="1"
		width="60%">
		<tr>

		</tr>
		<tr bgcolor="white">
			<td><b>Firstname</b></td>
			<td><b>Lastname</b></td>
			<td><b>Email</b></td>
			<td><b>ContactNo</b></td>
			<td><b>Address</b></td>
			<td><b>Gender</b></td>
		</tr>
		<%
			try {
				connection = DriverManager.getConnection(
						connectionUrl + dbName, userId, password);
				statement = connection.createStatement();
				String sql = "SELECT * FROM users where Role='Agent'";

				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		%>
		<tr bgcolor="#DEB887">

			<td><%=resultSet.getString("Firstname")%></td>
			<td><%=resultSet.getString("Lastname")%></td>
			<td><%=resultSet.getString("Email")%></td>
			<td><%=resultSet.getString("ContactNo")%></td>
			<td><%=resultSet.getString("Address")%></td>
			<td><%=resultSet.getString("Gender")%></td>

		</tr>

		<%
			}

			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
</body>
</html>