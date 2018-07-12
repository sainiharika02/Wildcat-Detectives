<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body {
	background-image: url('images/11.jpg');
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}

input[type=text] {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 30%;
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

div {
	margin-top: 20px;
	margin-left: 200px;
	margin-right: 200px;
	background-color: #f2f2f2;
	padding: 5px;
}
</style>
<title>Add Agent</title>
</head>

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
				data-toggle="dropdown" href="#"><h4>Services</h4>
					<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Personal Services</a></li>
					<li><a href="#">Corporate Services</a></li>
					<li><a href="#">Financial Services</a></li>
					<li><a href="#">Legal Services</a></li>
				</ul></li>
			<li><a href="AboutUs.jsp"><h4>AboutUs</h4></a> <li><a href="ContactUs.jsp"><h4>ContactUs</h4></a>
			<li><a href="Admin.jsp"><h4>Admin</h4></a></li></ul>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="/WildcatDetectives/Logout" style="margin-right:20px;"><span
					class="glyphicon glyphicon-log-in"></span> <h4>LogOut</h4></a></li>
		</ul>
	</div1>

	</nav>
	</ul>
	<center>
	<div>
		<form method="post" action="AddAgentServlet">
			<br> <label for="Firstname"><font size="5">First
					Name:</font></label> <input type="text" id="Firstname" name="Firstname" required> <br>
			<label for="Lastname"><font size="5">Last Name:</font></label> <input
					type="text" id="Lastname" name="Lastname" required> <br>
				 <label for="Email"><font size="5">Email :</font></label> <input
					type="text" id="Email" name="Email" required> <br> 
				<label for="ContactNo"><font size="5">ContactNo :</font></label> <input
					type="text" id="ContactNo" name="ContactNo" required> <br> 
				<label for="Address"><font size="5">Address :</font></label> <input
					type="text" id="Address" name="Address" required> <br> 
				<labelfor "Gender" ><font size="5">Gender:</font></label> <input
					type="radio" name="Gender" value="male" checked>
										Male <input type="radio" name="Gender" value="female">Female<br>
				
				<label for="Password"><font size="5">Password :</font></label> <input
					type="text" id="Password" name="Password" required> <br> <label
					for="Role"><font size="5">Role :</font></label> <input type="text"
					id="Role" name="Role" required>
	<br>
		<input type="submit" value="ADD">
	
	</center>



	</form>


</div>
</body>
</html>