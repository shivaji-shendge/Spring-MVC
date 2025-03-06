<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
<link rel="stylesheet" href="<c:url value='/resources/css/style.css?ver=1.0'/>">
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<br>
<div class="div1">
<form action="saveemp" method="post">
<label for="name">Enter Employee Name</label>
<input type='text' name='name' value='' id="name">
<label for="name">Enter Email</label>
<input type='text' name='email' value=''>
<label for="name">Enter Contact</label>
<input type='text' name='contact' value=''>
<input type='submit' name='submit' value='Add New Employee' id="bt1"><br><br>
${msg }
</form>
</div>
</body>
</html>