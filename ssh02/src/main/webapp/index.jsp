<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入畫面</title>
<script src="//code.jquery.com/jquery-1.10.2.js"
type="text/javascript"></script>
<script src="js/Login-ajax.js" type="text/javascript"></script>
</head>
	<body>
	
		<form method="POST" action="login">
		帳號:<input type = "text" id = "memberName" name = "memberName" placeholder = "請輸入帳號"/><br>
		密碼:<input type = "text" id = "password" name = "password" placeholder = "請輸入密碼"/><br>
		<input type="submit" id = "login" name="login" value="登入" />
		<a href="register"><input type="button" id = "register" name="register" value="註冊" ></a>
		<a href="forgetpwd"><input type="button" id = "forgetpwd" name="forgetpwd" value="忘記密碼" ></a>
		<a href="alluser"><input type="button" id = "alluser" name="alluser" value="會員資料" ></a>
		</form>
		
	</body>
</html>