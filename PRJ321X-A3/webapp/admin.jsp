<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<title>Admin</title>
</head>
<body>
<div>
	<div class="menu">
		<div>
		<h4>${name }</h4>
		<ul>
			<li><a href="#">Dashboard</a></li>
			<li><a href="#">Staff Manager</a></li>
		</ul>
		</div>
	</div>
	<div class="content">
		<div>
			<a href="home.jsp?page=1">Logout</a>
		</div>
		<div>
			<img alt="banner" src="${pageContext.request.contextPath}/media/banner.jpg">
		</div>
		<div>
			<p>Members of the team</p>
			<div class="user">
				<table>
				<tr>
					<th>id</th>
					<th>Name</th>
					<th>Student ID</th>
					<th>Class</th>
				</tr>
				<tr>
					<td>1</td>
					<td>Member 1</td>
					<td>Member Code 1</td>
					<td>Class 1</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Member 2</td>
					<td>Member Code 2</td>
					<td>Class 2</td>
				</tr>
				</table>
			</div>
		</div>
	</div>
</div>
</body>
</html>