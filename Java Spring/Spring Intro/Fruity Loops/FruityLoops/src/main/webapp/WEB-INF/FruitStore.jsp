<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="/CSS/style.css">
	
			<title>Fruit Loops</title>
	</head>
	<body>
		<div class="Container">
			<h1>Fruit Store</h1>

			<table class="Table">
				<tbody>
					<tr>
						<th class="name" >Name</th>
						<th class="price" >Price</th>
					</tr>
					<c:forEach var="fruit" items="${fruits}">
						<tr>
							<td><c:out value="${fruit.name}"/></td>
							<td><c:out value="${fruit.price}"/></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>	
	</body>
</html>