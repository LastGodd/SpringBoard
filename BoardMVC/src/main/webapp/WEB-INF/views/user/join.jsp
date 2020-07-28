<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div>
		<div><a href="/login">로그인</a></div>
		<form action="/user/joinPost" method="post" onsubmit="return joinon()">
			<div>아이디 : <input type="text" name="uid"></div>
			<div>비밀번호 : <input type="password" name="upw"></div>
			<div>확인 비밀번호 : <input type="password" name="upwConfirm"></div>
			<div>이름 : <input type="text" name="nm"></div>
			<div>주소 : <input type="text" name="Addr"></div>
			<div><input type="submit" value="회원가입"></div>
		</form>
	</div>
	<script>
		function joinon() {
			return confirm('회원가입 하시겠습니까?');
		}
	</script>
</body>
</html>