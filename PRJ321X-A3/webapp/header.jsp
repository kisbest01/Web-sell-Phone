<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="assets/bootstrap.css">
<link rel="stylesheet" href="css/home.css">
<title>Header</title>
</head>
<body>
<div class="container-fluid">
	<div id="header" class="row p-4 ps-5">
		<div class="col-xl-2 col-sm-3">
			<h1 class="text-white d-flex justify-content-center">PRJ321x</h1>
			<p class="text-info">Welcome to my Website</p>
		</div>
		<div class="col-xl-10 col-sm-9 pt-4">
			<form action="SearchController2" class="row">
				<label for="search" class="col-3 form-label bg-light ps-2">Categories</label>
				<div class="col-9">
					<input type="text" id="search" class="form-control" name="search">
				</div>
			</form>
		</div>
	</div>
	<div id="menu" class="row ps-5 pe-4">
		<div class="col-xl-2 col-sm-3"></div>
		<nav class="col-xl-10 col-sm-9 navbar navbar-expand-sm justify-content-between">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="home.jsp?page=1">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Product</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">About Us</a>
				</li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="login.jsp">Login</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Register</a>
				</li>
			</ul>
		</nav>
	</div>
</div>
<script type="text/javascript" src="assets/bootstrap.bundle.min.js"></script>
</body>
</html>