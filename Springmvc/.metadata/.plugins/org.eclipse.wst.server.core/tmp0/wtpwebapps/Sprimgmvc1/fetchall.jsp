<%@page import="Sprimgmvc1_dto.Sprpingdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Sprpingdto> o = (List<Sprpingdto>) request.getAttribute("obj");
	%>
	<table border="2px solid">
		<tr>
			<td>id</td>
			<td>name</td>
		</tr>



		<%
		for (Sprpingdto a : o) {
		%>
		<tr>
			<td><%=a.getId()%></td>
			<td><%=a.getName()%></td>
		</tr>
		<%
		}
		%>



	</table>
</body>
</html>