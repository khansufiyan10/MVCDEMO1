<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<center>
<h1>Login Page</h1>
<table border="1">
<form action="LoginController" method="post">

<tr>
<td>Username</td>
<td><input type="username" name="username" required/></td>
</tr>


<tr>
<td>password</td>
<td><input type="password" name="password" required /></td>
</tr>


<tr>
<td colspan="1"><input type="submit" value="Login"/></td>
<td><input type="reset" name="Reset"/></td>
</tr>

</form>

</table>
</center>

</body>
</html>