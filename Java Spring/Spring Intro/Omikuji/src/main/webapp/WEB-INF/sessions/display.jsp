<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html>
		<head>
    		<meta charset="UTF-8">
    		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    		<link rel="stylesheet" type="text/css" href="/css/style.css">
    
    		<title>Here's Your Omikuji!</title>
		</head>
		<body>
    		<div class="displayBox">
     			<p>
        			In <span><c:out value="${number}"/></span> years, you will<br>
        			live in <c:out value="${city}"/> with <br> <c:out value="${person}"/> as your <br> roommate,
        			selling <br> <span><c:out value="${hobby}"/></span> for a living.<br>
        			The next time you<br> see a <span><c:out value="${living_thing}"/></span>, you will<br> have good luck.<br>
        			Also, <span><c:out value="${message}"/></span>
    			</p>
    		</div>
    
    		<a href="/omikuji" class="btn">Go Back</a>
		</body>
	</html>