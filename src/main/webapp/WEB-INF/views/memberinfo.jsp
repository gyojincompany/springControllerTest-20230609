<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 확인</title>
</head>
<body>
	<h2>회원 정보 보기</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td>아이디</td>
			<td>${mid }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${mname }</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${mage }</td>
		</tr>
	</table>
</body>
</html>