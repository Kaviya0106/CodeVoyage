 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Form</title>
</head>
<body>
	<h2>Enter Your Name</h2>
	<form:form action="displayName" modelAttribute="s">
First Name:<form:input type="text" path="firstName"/><br> 
Last Name: <form:input type="text" path="lastName"/><br>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>