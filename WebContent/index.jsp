<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello from .jsp
	<br>
	
	<jsp:declaration>
		String s23 = "sdsdvsdv";
	</jsp:declaration>
	
	<%!
	private int sum(int a, int b){
		return a + b;
	}
	String s = "Hello2";
	
	%>
	
	<%
		int i = 1;
		int j = 2;
		out.println(i + j);
	%>
	
	<%
	out.println("<br>");
	out.println(sum(4, 5));
	%>
	<br>
	<%
	out.println(s23);
	%>
	<br>
	<%=1232 %>
	<br>
	<%=Arrays.asList(1, 2, 3, 4, 5) %>
	
	<jsp:scriptlet>
		out.println("jsp-scriptlet");
	</jsp:scriptlet>
	
	<jsp:expression>s</jsp:expression>
</body>
</html>