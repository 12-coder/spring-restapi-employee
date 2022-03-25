<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
</head>
<body>
	<h2>Create New Student</h2>
	<form action="/student/saveStudent" method="post">
	<pre>
		ID : <input type="number" name="id"/>
		Name: <input type="text" name="name"/>
		Marks: <input type="number" name="marks"/>
		<input type="submit" value="Save Student"/>
	</pre>
	</form>
</body>
</html>