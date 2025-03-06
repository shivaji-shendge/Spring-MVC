<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css?ver=1.0'/>">
</head>
<body>
<div class="div1">
<form action="updateemp" method="post">
<input type='hidden' name='id' value='${id}' id="empid">
<label for="name">Enter Employee Name</label>
<input type='text' name='name' value='${name}' id="name">
<label for="name">Enter Email</label>
<input type='text' name='email' value='${email}'>
<label for="name">Enter Contact</label>
<input type='text' name='contact' value='${contact}'>
<input type='submit' name='submit' value='Update Employee' id="bt1"><br><br>
${msg }
</form>
</div>
</body>
</html>