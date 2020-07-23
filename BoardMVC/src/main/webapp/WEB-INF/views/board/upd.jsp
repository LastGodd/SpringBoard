<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/upd" method="post">
		<div><input type="hidden" name="i_board" value="${data.i_board}"></div>
		<div>제목: <input type="text" name="title" size="15" value="${data.title}"></div>
		<div>내용: <textarea name="ctnt">${data.ctnt}</textarea></div>
		<div><input type="submit" value="등록"></div>
	</form>
</body>
</html>