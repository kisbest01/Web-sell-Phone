<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page import="dao.ListProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="row border-4 border-bottom border-warning p-5">
<c:set var="list" value="${results }"></c:set>
<c:if test="${list.isEmpty() }">
	<p class="d-flex justify-content-center mt-5">${"Không tìm thấy sản phẩm!!!" }</p>
</c:if>
<c:set var="begin" value="${0 }"></c:set>
<c:set var="end" value="${5 }"></c:set>
<c:if test="${param.page > 1}">
	<c:set var="begin" value="${end + 1 }"></c:set>
	<c:set var="end" value="${begin + 5 }"></c:set>
</c:if>
<c:if test="${end >= list.size() }">
		<c:set var="end" value="${list.size() - 1 }"></c:set>
</c:if>
<c:if test="${list.size() > 0 }">
<c:forEach var="j" begin="${begin }" end="${end }">
	<div class="border col-xl-3 col-lg-4 col-sm-5 p-3 me-4 mb-4">
		<a href="InformationProductController?id=${list.get(j).getId() }">
			<img alt="anh" src="${list.get(j).getSrc() }" width="200px" class="pb-3">
		</a>
		<p class="text-secondary text-uppercase mb-0 mt-1">${list.get(j).getType() }</p>
		<p>${list.get(j).getName() }</p>
		<p class="text-danger">$${list.get(j).getPrice() }</p>
	</div>
</c:forEach>
</c:if>
<ul class="pagination">
	<c:if test="${param.page > 1 }">
		<li class="page-item"><a class="page-link" href="home.jsp?page=${p - 1 }">Previous</a></li>
	</c:if>
	<c:set var="totalPage" value="${Math.ceil(list.size() / 6.0) }"></c:set>
	<c:forEach var="i" begin="1" end="${totalPage }">
		<li class="page-item"><a class="page-link" href="SearchController2?search=${param.search}&page=${i }">${i }</a></li>
	</c:forEach>
	<c:if test="${param.page < totalPage }">
		<li class="page-item"><a class="page-link" href="home.jsp?page=${(p + 1) }">Next</a></li>
	</c:if>
</ul>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>