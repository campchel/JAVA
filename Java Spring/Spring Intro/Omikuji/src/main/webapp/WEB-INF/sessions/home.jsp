<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<title>Send an Omikuji!</title>
	</head>
	<body>
    	<div class="container">
        	<form method="POST" action="/form/process">
            	<div class="form-group">
                	<label for="number">Pick a number from 5 to 25:</label>
                	<select class="form-control" id="number" name="number">
                    	<option value="">-- Please select --</option>
                    		<% for (int i = 5; i <= 25; i++) { %>
                        <option value="<%= i %>"><%= i %></option>
                    		<% } %>
               	 	</select>
            	</div>
            
           		<div class="form-group">
                	<label for="city">Enter the name of any city:</label>
                	<input type="text" class="form-control"  id="city" name="city">
            	</div>
            
            	<div class="form-group">
                	<label for="person">Enter the name of any real person:</label>
                	<input type="text" class="form-control" id="person" name="person">
            	</div>
            
            	<div class="form-group">
                	<label for="hobby">Enter professional endeavor or hobby:</label>
                	<input type="text" class="form-control" id="hobby" name="hobby">
            	</div>
            
            	<div class="form-group">
                	<label for="living_thing">Enter any type of living thing:</label>
                	<input type="text" class="form-control" id="living_thing" name="living_thing">
            	</div>
            
            	<div class="form-group">
                	<label for="message">Say something nice to someone:</label>
                	<textarea class="form-control" id="message" name="message" rows="4" cols="50"></textarea>
            	</div>
            
            	<h4>Send and show a friend</h4>
            	<button type="submit" class="btn btn-primary">Submit</button>
        	</form>
    	</div>
	</body>
</html>