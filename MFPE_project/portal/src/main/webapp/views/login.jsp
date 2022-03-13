<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<link rel="stylesheet" type="text/css" href="login.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #989898;
}
.logo {
	margin-top: 6px;
	margin-bottom: 7px;
	width: 3em;
	height: 3em;
	margin-left: 20px;
}
.heading {
align: center;
color: white;
font-family: Georgia;
	font-size: 2.5em;
	text-align: left;
	margin-top: 5px;
    margin-left:5px;
}
#logo{
	margin-top: 10px;
	margin-bottom: 7px;
	width: 3em;
	height: 3em;
	margin-left: 1px;
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

nav{
height:55px;
}
h3{
align: center;
color: white;
font-family: Georgia;
}
h5{align: center;
color: black;
font-family: Georgia, Fantasy;
}
</style>

</head>
 <!-- <body style="background-image: url('');"> -->
 
  <body style="background-image: url('https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77701450890.jpg'); width:2000; height:1000;">
	<br>
	<nav class="navbar navbar-expand-sm  navbar-dark"> <!-- Brand/logo -->
	<!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item"><a class="navbar-brand" href="#"> <img
				src="https://www.graphicsprings.com/filestorage/stencils/62eedfb5818a17fdb9581b1b9324a630.png?width=500&height=500"
				id="logo" class="d-inline-block align-top" alt="">
				<span class="heading"><em>Cognizant Pharmaceutical</em></span>
		</a></li>

	</ul>
	</nav>





	<div class="container-fluid">

		<!-- Demo content-->
		<div class="container">
 
            <div class="float-right"
                style="margin-top: 100px; background-color: rgba(255, 255, 255, 0.5); height:500px; width: 350px; box-shadow: 5px 6px 5px 6px #888888; padding: 30px; border-radius: 5mm;">
                <div class="text-center text-dark font-italic"
                    style="margin-bottom: 25px;">
                    <br><br><br>
					<h3 align="center" class="display-4">${loginMessage}</h3>
					<p align="center" class="text-muted mb-4"></p>

					<form:errors path="usercredentials.*" />

					<form:form action="/user/homepage" modelAttribute="usercredentials"
						method="post">
						<div class="form-group mb-3">
							<input id="userid" type="text" name="userid"
								placeholder="Username" required="" autofocus=""
								class="form-control rounded-pill border-0 shadow-sm px-4">
						</div>
						<div class="form-group mb-3">
							<input id="password" type="password" name="password"
								placeholder="Password" required=""
								class="form-control rounded-pill border-0 shadow-sm px-4 text-primary">
						</div>

						<button type="submit" name="submit"
							class="btn btn-block text-uppercase mb-2 shadow-lg" id="bt"><b>Login</b></button>
						<div class="text-center d-flex justify-content-between mt-4">
							<p>${errormsg}</u>
							</p>
						</div>
					</form:form>
				</div>
			</div>
		</div>
		
		
		
		
		<!-- End -->


	</div>
	<!-- End -->







	


</body>
</html>