<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.div1{
width:300px;
height:250px;
margin:50px auto;
}
input{
display:block;
width:80%;
height:30px;
margin:20px auto;
padding:10px 25px;
}
input[type="submit"]{
color:white;
background-color:blue;
height:40px;
width:100px;
margin-top:20px;
border-radius:10px;
outline:none;
}
</style>
</head>
<body>
<div class="div1">
<form action="save" >
<input type=text name="name" value="" placeholder="Enter your name">
<input type=text name="email" value="" placeholder="Enter your email">
<input type=text name="contact" value="" placeholder="Enter your contact">
<input type="submit" name="submit" value="register">
</form>
</div>

</body>
</html>