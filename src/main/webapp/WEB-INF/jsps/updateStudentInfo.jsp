<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <h1>.......Save Location..........</h1>
 <form action="/updateStu" method="post">
 <pre>

    <pre>
		ID : <input type="number" name="id" value="${s.id}" readonly/>
		Name: <input type="text" name="name" value="${s.name}"/>
		Marks: <input type="number" name="marks" value="${s.marks}"/>
		<input type="submit" value="Update Student"/>
	</pre>

 
</body>
</html>