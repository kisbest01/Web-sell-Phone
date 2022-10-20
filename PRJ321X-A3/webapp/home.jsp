<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page import="jakarta.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.*"%>
<%@page import="context.DBContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<c:import url="header.jsp"></c:import>
<div class="row border-4 border-bottom border-warning p-5">
<jsp:useBean id="dc" class="context.DBContext" scope="session"></jsp:useBean>
<c:set var="p" value="${param.page}"></c:set>
<c:if test="${p > 1 }">
	<c:set var="start" value="${(p - 1) * 6 }"></c:set>
</c:if>
<c:set var="list" value="${dc.getProducts(start, 6) }"></c:set>
<c:forEach var="j" begin="0" end="${list.size() - 1 }">
	<div class="border col-xl-3 col-lg-4 col-sm-5 p-3 me-4 mb-4">
		<a href="InformationProductController?id=${list.get(j).getId()}">
			<img alt="anh" src="${list.get(j).getSrc() }" width="200px" class="pb-3">
		</a>
		<p class="text-secondary text-uppercase mb-0 mt-1">${list.get(j).getType() }</p>
		<p>${list.get(j).getName() }</p>
		<p class="text-danger">$${list.get(j).getPrice() }</p>
	</div>
</c:forEach>

<ul class="pagination">
	<c:if test="${p > 1 }">
		<li class="page-item"><a class="page-link" href="home.jsp?page=${p - 1 }">Previous</a></li>
	</c:if>
	<c:set var="totalList" value="${dc.getProducts() }"></c:set>
	<c:set var="totalPage" value="${Math.ceil(totalList.size() / 6.0) }"></c:set>
	<c:forEach var="i" begin="1" end="${totalPage }">
		<li class="page-item"><a class="page-link" href="home.jsp?page=${i }">${i }</a></li>
	</c:forEach>
	<c:if test="${p < totalPage }">
		<li class="page-item"><a class="page-link" href="home.jsp?page=${(p + 1) }">Next</a></li>
	</c:if>
</ul>
</div>
<c:import url="footer.jsp"></c:import>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/bootstrap.bundle.min.js"></script>
</body>
</html>