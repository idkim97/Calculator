<%@ page import="java.sql.*" %>
<%@ page import="calculate_Ver_jsp.CalAbstract" %>
<%@ page import="calculate_Ver_jsp.CalAdapter" %>
<%@ page import="calculate_Ver_jsp.CalResult" %>
<%@ page import="calculate_Ver_jsp.ContinuousCal" %>
<%@ page import="calculate_Ver_jsp.StandardCal" %>
<%@ page import="calculate_Ver_jsp.CalMain" %>
<%@ page import="calculate_Ver_jsp.CalLong" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>계산기 시작화면</title>
</head>
<body>
	<form action="ContinuousInsert.jsp" method="post">
		<input type="submit" value="연속 계산">
	<br><br>
	</form>
	<form action="StandardInsert.jsp" method="post">
		<input type="submit" value="일반 계산">
	</form>
	
</body>
</html>