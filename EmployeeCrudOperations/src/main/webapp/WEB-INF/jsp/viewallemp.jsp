<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Employee</title>
</head>
<body>
   <jsp:include page="index.jsp"></jsp:include>
   <br>
   <div class="container">
   <table class="table table-striped">
   <tr>
   	   <th>Id </th>
       <th>Name </th>
       <th>Email</th>
       <th>Contact</th>
       <th>Update</th>
       <th>Delete</th>
   </tr>
   <c:forEach var="employee" items="${empList}">
   <tr>
       <td>${employee.getId()}</td>
       <td>${employee.getName()}</td>
       <td>${employee.getEmail()}</td>
       <td>${employee.getContact()}</td>
       <td><a href="update?empid=${employee.getId()}&empname=${employee.getName()}&empemail=${employee.getEmail()}&empcontact=${employee.getContact()}">Update</a></td>
       <td><a href="del?empid=${employee.getId()}">Delete</a></td>
   </tr>
   </c:forEach>
</table>
</div> 
</body>
</html>