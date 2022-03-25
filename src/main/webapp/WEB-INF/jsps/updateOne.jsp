<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
</head>
<body>
	<h2>update student by id</h2>
	<form action="/student/updateTwo" method="post">
	<pre>
	Enter ID of the student to be updated : <input type="number" name="id"/>
		<input type="submit" value="submit"/>
	</pre>
	</form>
</body>
</html>