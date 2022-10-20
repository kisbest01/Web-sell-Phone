<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="border-4 border-bottom border-warning p-4">
<c:set var="list" value="${cart.getItems()}"></c:set>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Product in cart: ${list.size()}</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Amount</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<c:if test="${list.size() > 0 }">
		<c:forEach var="i" begin="0" end="${list.size() - 1}">
			<tr>
				<td>${list.get(i).getName() }<br>ID:  ${list.get(i).getId() }</td>
				<td>($) ${list.get(i).getPrice() }</td>
				<td>${list.get(i).getNumber() }</td>
				<td><fmt:formatNumber type="currency" currencySymbol="($) " value="${list.get(i).getPrice() * list.get(i).getNumber() }"></fmt:formatNumber></td>
				<td><a href="AddToCartController?id=${list.get(i).getId()}&action=delete">Delete</a></td>
			</tr>
		</c:forEach>
		</c:if>
			<tr>
				<td style="text-align: right;" colspan="5">Total ${cart.getAmount() }</td>
			</tr>
		</tbody>
	</table>
	
	<form action="PayController">
	<div class="row mb-2">
		<label for="name" class="form-label col">Customer name</label>
		<div class="col">
			<input type="text" id="name" class="form-control" name="name" required="required">
		</div>
	</div>
	<div class="row mb-2">
		<label for="address" class="form-label col">Customer address</label>
		<div class="col">
			<input type="text" id="address" class="form-control" name="address" required="required">
		</div>
	</div>
	<div class="row mb-2">
		<label for="discount" class="form-label col">Discount code(if any):</label>
		<div class="col">
			<input type="number" id="discount" class="form-control" name="discount">
		</div>
	</div>	
	<div class="d-flex justify-content-end">
		<button class="btn btn-warning text-white">Submit</button>
	</div>
	</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>