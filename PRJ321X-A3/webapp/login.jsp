<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="assets/bootstrap.css">
<link rel="stylesheet" href="css/login.css">
<meta charset="UTF-8">
<title>Login</title>
</head>
<body class="bg-light">
<div id="content" class="shadow mx-auto d-flex flex-row mt-5">
	<div class="px-3 py-5 flex-fill bg-white">
		<h2 class="pt-5"><b>Sign in</b></h2>
		<form action="LoginServlet" method="get">
		<c:if test="${error != '' }">
			<p>${error }</p>
		</c:if>
			<input type="email" id="user" class="form-control my-2 bg-light border-0" name="user">
			<input type="password" id="password" class="form-control my-2 bg-light border-0" name="password">
			<a href="#" class="text-dark text-decoration-none"> Forgot your password?</a><br>
			<button class="mt-2 px-4 py-2 rounded-pill border-0 bg-warning text-white">LOGIN</button>
		</form>
	</div>
	<div class="px-3 py-5 bg-dark flex-fill">
		<h2 class="text-white pt-5 mt-5"><b>Welcome Back!</b></h2>
		<p class="text-white">To keep connected with us<br>please login with your personal<br>info</p>
	</div>
</div>
<script type="text/javascript" src="assets/bootstrap.bundle.min.js"></script>
</body>
</html>