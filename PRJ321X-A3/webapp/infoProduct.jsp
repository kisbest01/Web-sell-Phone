<%@page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info Product</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="border-4 border-bottom border-warning">
<c:set var="p" value="${product }"></c:set>
	<div class="row p-5 ms-4">
		<h2 class="border-bottom pb-2 mb-5">${p.getName() }</h2>
		<div class="col-sm-3">
			<img alt="anh" src="${p.getSrc() }" width="200px" class="pb-3">
		</div>
		<div class="col-sm-4">
			<fmt:setLocale value="vi_VN" />
			<h2 class="text-danger"><fmt:formatNumber type="currency" currencySymbol="VNĐ"  value="${p.getPrice() * 1000000}" ></fmt:formatNumber></h2>
			<p>Product Description: ${p.getDescription() }</p>
			<a class="bg-warning text-white p-2 text-decoration-none" href="AddToCartController?id=${p.getId()}&action=add">Add to Card</a>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>