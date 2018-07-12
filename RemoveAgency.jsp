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
</head>
<title>Remove Agency</title>

<style>
body {
	background-image: url('images/11.jpg');
}
.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}
input[type=text]{
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 20%;
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
		<center>
			<ul class="nav navbar-nav">
				<li class="active"><a href="HomePage.jsp"><h4>Home</h4></a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"><h4>Services</h4> <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Personal Services</a></li>
						<li><a href="#">Corporate Services</a></li>
						<li><a href="#">Financial Services</a></li>
						<li><a href="#">Legal Services</a></li>
					</ul></li>
				<li><a href="AboutUs.jsp"><h4>AboutUs</h4></a></li>
				<li><a href="ContactUs.jsp"><h4>ContactUs</h4></a></li>
				<li><a href="Admin.jsp"><h4>Admin</h4></a></li>
				

			</ul>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="/WildcatDetectives/Logout" style="margin-right:20px;"><span
					class="glyphicon glyphicon-log-in"></span> <h4>LogOut</h4></a></li>
		</ul>
	</div>

	</nav>
	</ul>
	<center>
		<form method="post" action="RemoveAgencyServlet">
			<br>
			<label for="AgencyName"><font size="5" color="white">Agency
					Name:</font></label> <input type="text" id="AgencyName" name="AgencyName" required>
			<br> <input type="submit" value="Remove">
		</form>
	</center>
</body>
</html>