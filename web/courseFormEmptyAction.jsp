<%@ page import="domain.model.Course"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/sample.css" type="text/css">
<title>Course Info</title>
</head>
<body>
<h2>Course info</h2>
	<form method="POST" action="#">
		<fieldset>
			<legend>Identification</legend>
			<p>
				<label for="title">Name: </label>
				<input id="title" name="title" value="someValue">
			</p>
			<p>
				<label for="code">Code (required): </label>
				<input id="code" name="code" required value="someCode">
			</p>
		</fieldset>
		<fieldset>
			<legend>Organization</legend>
			<p>
				<label for="credits">Credits (required): </label>
				<input id="credits"
					name="credits" type="number" placeholder="Credits for the course"
					value="3" title="Credits" required>
			</p>
			<p>
				<label for="contact">Contact hours (required): </label>
				<input id="contact" name="contact" type="number"
					placeholder="Contact hours per week" value="2"
					title="Contact hours" required>
			</p>
		</fieldset>
		<p>
			<input type="submit" value="Calculate">
		</p>
	</form>
	<%
	String message = "";
	if(request.getParameter("title") != null){
		String title = request.getParameter("title");
		String code = request.getParameter("code");
		String creditsFromParameter = request.getParameter("credits");
		int credits = Integer.parseInt(creditsFromParameter);
		String contactFromParameter = request.getParameter("contact");
		int contactHours = Integer.parseInt(contactFromParameter);
		
		Course course = new Course(title, code, credits, contactHours);
		message = "You have to study " + course.getWorkLoad() + " hours for the course " + course.getTitle();
	}
	 %>
	 <p><%= message %></p>
</body>
</html>