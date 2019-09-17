<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<%
			Map<String, Integer> persons = (Map<String, Integer>) request.getAttribute("persons");
			for(Map.Entry<String, Integer> entry: persons.entrySet()){
				out.println("<tr><td>" + entry.getKey() + "</td><td>" + entry.getValue() + "</td></tr>");
			}
		%>
	</table>
	<br>
	<table border="1px">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="person" items="${persons}">
			<tr>
				<td><c:out value="${person.key}"/></td>
				<td><c:out value="${person.value}"/></td>
			</tr>
		</c:forEach>
	</table>
	
	<c:set var="myVal" value="1234"/>
	
	<p><c:out value="${myVal}"/></p>
	
</body>
</html>