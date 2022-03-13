
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<head>
<title>logout</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="style/index-
style.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #989898
}
.heading {
align: center;
color: white;
font-family: Georgia;
	font-size: 2.5em;
	text-align: left;
	margin-top: 10px;
    margin-left:5px;
}
#bt{
font-family:Gill Sans, Cursive;
display: block;
  border:none;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  text-align: center;
}
#logo{
	margin-top: 6px;
	margin-bottom: 7px;
	width: 3em;
	height: 3em;
	margin-left: 1px;
}
h3{
align: center;
color: white;
font-family: Georgia;
}
.button {
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

.button2 {
	background-color: #008CBA;
} /* Blue */
.container {
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>
</head>
<body>
  <body style="background-image: url('https://wallpaperbat.com/img/99304-medical-wallpaper-for-desktop.jpg'); width:2000; height:1200;">
	<nav class="navbar navbar-expand-sm  navbar-dark"> <!-- Brand/logo -->
		<a class="navbar-brand" href="#"> <img
				src="https://www.graphicsprings.com/filestorage/stencils/62eedfb5818a17fdb9581b1b9324a630.png?width=500&height=500"
				id="logo" class="d-inline-block align-top" alt="">
				<span class="heading"><em>Cognizant Pharmaceutical</em></span>
		</a>
		
	</nav>
	<!-- Demo content-->
	<div class="container" style="margin-top: 100px; background-color: rgba(255, 255, 255, 0.5); height:300px; width: 650px; box-shadow: 5px 6px 5px 6px #888888; padding: 30px; border-radius: 5mm;">


		<div class="text-center text-dark font-italic col-lg-10 col-xl-7 mx-auto" style="margin-top: 100px;">
			<center>
				<h3 class="display-4"><em>Logged Out</em></h3>
				<br><br>
				<a class="btn btn-block text-uppercase mb-2 shadow-lg" id="bt" href="/user/login">Sign In</a>
				<br><br>
				
			</center>
		</div>

	</div>
	<!-- End -->







</body>
</html>
