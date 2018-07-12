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
<link rel="icon" href="/images/logo.jpg">
<title>WILDCAT DETECTIVE</title>

</head>
<style>
body {
	background-image: url('images/10.jpg');
}

p {
	color: white;
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}

.navbar-right {
	height: 70px;
	padding: 10px;
}

input,select {
	color: black;
}

.box {
	color: grey;
	border: 2px solid #f2f2f2;
	margin-top: 1px;
	padding: 25px;
	margin-bottom: 500px;
	margin-right: 140px;
	margin-left: 150px;
}

.topright {
	position: absolute;
	top: 150px;
	right: 16px;
	font-size: 20px;
}

#x {
	float: left;
}

div1 {
	background-color: #808080;
	width: 600px;
	border: 5px solid black;
	padding: 25px;
	margin: 25px;
	margin-top: 100px;
	margin-left: 100px;
	float: left;
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
					data-toggle="dropdown" href="#"><h4>Services </h4><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Personal Services</a></li>
						<li><a href="#">Corporate Services</a></li>
						<li><a href="#">Financial Services</a></li>
						<li><a href="#">Legal Services</a></li>
					</ul></li>
				<li><a href="ContactUs.jsp"><h4>ContactUs</h4></a>
				</l>
			</ul>
		</center>
		<div class="container">
			<ul class="nav navbar-nav navbar-right">
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#myModal">SignUp</button>
		</div>
	</nav>
	<center></center>
	<div1>
	<h2>Welcome to Wildc@t Detectives</h2>
	<h4>We are a well-respected private investigation organization
		(detective agency) providing customized, flexible, personalized,
		services throughout Hyderabad.</h4>
	<br>
	<a style="color: black;" href="AboutUs.jsp"><button
			style="background-color: white;"
			class="w3-button w3-green w3-round-large">Know More</button></a> </div1>

	</center>
	<div class="container"></div>
	<br>
<br>
<br>
	<div class="topright">



		<form action="LoginServlet" method="post">
			<p align="center">
				<b>LOGIN</B>
			</p>

			<div class="box">

				Username:<br> <input type="text" name="uname" required>
				<br> Password:<br> <input type="password" name="pwd"
					required> <br>
				<div class="checkbox">
					<label><input type="checkbox" name="remember">
						Remember me</label>
				</div>
				<input type="submit" value="Login"> &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp;
				<p1 style="color:pink;" data-toggle="modal"
					data-target="#mypwdModal"> <u>Forgot Password ?</u></p1>

			</div>
		</form>



	</div>
	</form>


	<div class="modal fade" id="mypwdModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>

				</div>
				<div class="modal-body">
					<p>
					<center>
						<h1>
							<b>Forgot your Password ?</b>
						</h1>
						We'll send you an email with instructions to choose a new
						password.

						<form method="post" action="RegistrationServlet">
							<table>
								<form class="form-inline"></form>
								<div class="form-group">
									<label for="password"> </label> <input type="Email"
										class="form-control" id="Password" placeholder="Enter Email"
										name="Email">
								</div>

								<button type="submit" class="btn btn-default">Continue</button>
								</form>
								</div>
							</table>
							</p>
				</div>

			</div>

		</div>
	</div>
	</div>


	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>

				</div>
				<div class="modal-body">
					<p>
					<center>
						<h1>
							<b><u>Register</u></b>
						</h1>
						<hr>

						<form method="post" action="RegistrationServlet">
							<table>

								<form class="form-inline"></form>
								<div class="form-group">
									<label for="name"></label> <input type="text"
										class="form-control" id="Firstname"
										placeholder="Enter Firstname" name="Firstname" required>
								</div>


								<form class="form-inline"></form>
								<div class="form-group">
									<label for="name"></label> <input type="text"
										class="form-control" id="Lastname"
										placeholder="Enter Lastname" name="Lastname" required>
								</div>


								<form class="form-inline"></form>
								<div class="form-group">
									<label for="Email"></label> <input type="text"
										class="form-control" id="Email" placeholder="Enter Email"
										name="Email" required>
								</div>


								<form class="form-inline"></form>
								<div class="form-group">
									<label for="number"></label> <input type="text"
										class="form-control" id="ContactNo"
										placeholder="Enter Contact No" name="ContactNo" required>
								</div>


								<form class="form-inline"></form>
								<div class="form-group">
									<label for="address"> </label> <input type="text"
										class="form-control" id="Address" placeholder="Enter Address"
										name="Address" required>
								</div>



								<div>
									<center>
										Gender: <input type="radio" name="Gender" value="male" checked
											required> Male <input type="radio" name="Gender"
											value="female" required>Female

									</center>
								</div>


								<form class="form-inline"></form>
								<div class="form-group">
									<label for="password"> </label> <input type="password"
										class="form-control" id="Password"
										placeholder="Enter Password" name="Password" required>
								</div>

								<button type="submit" class="btn btn-default">Submit</button>
								</form>
								</div>
							</table>
							</p>
				</div>

			</div>

		</div>
	</div>
	</div>

	</ul>
	</div>
	</nav>



</body>
</html>