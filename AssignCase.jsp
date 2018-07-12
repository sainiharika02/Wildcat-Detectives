
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
<title>Add Newcase</title>
</head>
<%@ page
		import="java.util.*,com.cb.beans.AddNewCaseBean,com.cb.beans.RegistrationBean"%>
	<%!ArrayList<AddNewCaseBean> openCases;
	ArrayList<RegistrationBean> agentlist;
	%>

	<%
	openCases = (ArrayList) request.getAttribute("CaseIDList");
	agentlist = (ArrayList) request.getAttribute("AgentList");
%>
<style>
body {
	background-image: url('images/11.jpg');
}

.navbar-header {
	margin-top: 5px;
	height: 120px;
	padding: 10px;
}

div {
	margin-top: 20px;
	margin-left: 200px;
	margin-right: 200px;
	background-color: #f2f2f2;
	padding: 5px;
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
				data-toggle="dropdown" href="#"><h4>Services</h4>
					<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Personal Services</a></li>
					<li><a href="#">Corporate Services</a></li>
					<li><a href="#">Financial Services</a></li>
					<li><a href="#">Legal Services</a></li>
				</ul></li>
			<li><a href="ContactUs.jsp"><h4>ContactUs</h4></a> </l>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/WidcatDetectives/Logout" style="margin-right: 20px;"><span
					class="glyphicon glyphicon-log-in"></span>
					<h4>LogOut</h4></a></li>
		</ul>
	</div1> </nav>

	
	<center>

	<div>
			<form action="AssignCaseServlet" method="post">


				Select CaseID :
				<%
	if (openCases != null && !openCases.isEmpty()) {

		out.println("<select name = 'CaseID'>");
		for (AddNewCaseBean cb : openCases) {
			int cid = cb.getCaseID();
			out.println("<option value = '" + cid + "'>" + cid
					+ "</option>");
		}
		out.println("</select>");
	} else {
		out.println("No Cases to assign");
	}
%>

				<br> <br> Select Agent Email :

				<%
out.println("<select name = 'Agent_Email'>");
for (RegistrationBean rb : agentlist){
	String aid = rb.getEmail();
	out.println("<option value = '" + aid + "'>" + rb.getEmail() + "</option>" );
}
out.println("</select>");%>



				<br> <br> <input type="submit" value="Assign">
			</form>
			</div>
	</center>
</body>
</html>