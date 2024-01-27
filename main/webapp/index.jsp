<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>select course</h1>
${mycart}
<form action="selectcourse">
<table>
<tr><td><select name="category">
<option value="">--select course--</option>
<option value="java">java course</option>
<option value="python">python course</option>
<option value="web">web course</option></td></tr>
<tr><td><input type="submit" value="show books"/></td></tr>
</select>
</table>
</form>
</body>
</html>