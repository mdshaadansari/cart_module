<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showmycart">
<input type="submit" value="show my cart"/>
</form>

  
<%
int count=1;
List obj=(List)session.getAttribute("mycart");
for(Object bname:obj){
 
%>

<tr><td><%= count++ %></td>
<td><%= bname%></td>
<td>500</td>
<td>10% Off</td>
<td><form action="addtocart">
<input type="hidden" name="bname" value="<%=bname %>"/>
<input type="submit" value="Add to Cart"/>
</form>		
</td>
</tr>
		
		
		
<%
	
}
%>
</body>
</html>