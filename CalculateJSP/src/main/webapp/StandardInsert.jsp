<%@ page import="java.sql.*" %>
<%@ page import="calculate_Ver_jsp_Singleton.CalAbstract" %>
<%@ page import="calculate_Ver_jsp_Singleton.CalAdapter" %>
<%@ page import="calculate_Ver_jsp_Singleton.CalResult" %>
<%@ page import="calculate_Ver_jsp_Singleton.ContinuousCal" %>
<%@ page import="calculate_Ver_jsp_Singleton.StandardCal" %>
<%@ page import="calculate_Ver_jsp_Singleton.CalMain" %>
<%@ page import="calculate_Ver_jsp_Singleton.CalLong" %>
<%@ page import="calculate_Ver_jsp_Singleton.StdCal_Singleton" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	
	<h2>계산할 숫자와 연산자를 입력하세요 (일반계산)</h2>
	<form action="StandardResultSingleton.jsp" method="post">


		계산식을 입력하세요 : <input type="text" name="temp"><br> <br>
		<input type="submit" value="입력">
	</form>

	<br>

	<form action="IndexCal.jsp" method="post">
		<input type="submit" value="계산기 다시선택">
	</form>

</body>
</html>