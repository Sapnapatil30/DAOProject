<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<div>
<form style="width:60%;
	height:250px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="signup" method=post>
<h1 style="color:#0000a0;
	align:center;">Registration Form</h1>
<label>Username : </label>
<input type="text" name="uname" placeholder="Enter the username">
</br>
<br>
<label>Password : </label>
<input type="password" name="pass" placeholder="Enter the password">
<br>
<br>
<label>Conform Password : </label>
<input type="password" name="cpass" placeholder="Re-Enetr the password">
<br>
<br>
<label>Email : </label>
<input type="email" name="email" placeholder="Enter the email Id">
<br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Sign-up">
</form>
</div>
<div></div>

<div>
<form style="width:60%;
	height:100px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="delete" method=post>
<h3 style="color:#0000a0;
	align:center;">For Delete record</h3>
<br>
<label>Username : </label>
<input type="text" name="uname" placeholder="Enter the username">
</br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Delete">
</form>
</div>
<div></div>
<div>
<form style="width:60%;
	height:250px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="update" method=post>
<h3 style="color:#0000a0;
	align:center;">Update records</h3>
<label>Username : </label>
<input type="text" name="uname" placeholder="Enter the username">
</br>
<br>
<label>Password : </label>
<input type="password" name="pass" placeholder="Enter the password">
<br>
<br>
<label>Conform Password : </label>
<input type="password" name="cpass" placeholder="Re-Enetr the password">
<br>
<br>
<label>Email : </label>
<input type="email" name="email" placeholder="Enter the email Id">
<br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Update">
</form>
</div>
<div></div>
<div>
<form style="width:60%;
	height:100px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="users" method=post>
<h3 style="color:#0000a0;
	align:center;">Show records</h3>
<br>
<label>Username : </label>
<input type="text" name="uname" placeholder="Enter the username">
</br>
<br>
<input style="background-color:green;color:white;" type="submit" value="Show record">
</form>
</div>
<div></div>
<div>
<form style="width:60%;
	height:250px;
	background-color:#9da6f7;
	border:1px solid black;
	padding:50px;" action="allusers" method=post>
<h3 style="color:#0000a0;
	align:center;">Show all records</h3>
	</br>
<br>
<input style="background-color:green;color:white;" type="submit" value="All record">
</form>
</div>
</div>
</body>
</html>