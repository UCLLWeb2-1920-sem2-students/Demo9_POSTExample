<%@ page import="domain.model.Course"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
	
<!DOCTYPE html>
<html>
<head>
	<title>Study</title>
	<link rel="stylesheet" href="css/sample.css" type="text/css">
</head>
<body>
	<h1>Study</h1>
	<%	Course course = (Course)request.getAttribute("course"); %>
	<p>You have to study <%= course.getWorkLoad() %> hours for the course <%= course.getTitle() %></p>
	<img src="images/study.jpg" alt="">
</body>
</html>