<%@ page import="java.sql.*" %>
<%@ page import="calculate_Ver_Adapter.CalAbstract" %>
<%@ page import="calculate_Ver_Adapter.CalAdapter" %>
<%@ page import="calculate_Ver_Adapter.CalResult" %>
<%@ page import="calculate_Ver_Adapter.ContinuousCal" %>
<%@ page import="calculate_Ver_Adapter.StandardCal" %>
<%@ page import="calculate_Ver_Adapter.CalMain" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>계산기 입력 화면</title>
</head>
<body>

	
	
	<h2> 계산할 숫자와 연산자를 입력하세요</h2>
	<form action="ResultCal.jsp" method="post">
		
		
		값을 입력하세요 : <input type="text" name="temp"><br>
		
		<br>
		<input type="submit" value="입력">
	</form>
	
	<!-- 입력값을 std.cal(temp)에 temp에 넣어주고 계산한뒤에
			결과값인 sb와 result를 가져와서 출력하면 됨 -->
	
	
	
	
	
	
	
	
</body>
</html>