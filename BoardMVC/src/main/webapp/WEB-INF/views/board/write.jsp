<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/write" method="post">
		<div>제목: <input type="text" name="title" size="15"></div>
		<div>내용: <textarea name="ctnt"></textarea></div>
		<div><input type="submit" value="등록"></div>
		<div><a href="/board/list">목록</a></div>
	</form>
</body>
</html>