<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>註冊畫面</title>
<script src="//code.jquery.com/jquery-1.10.2.js"
type="text/javascript"></script>
<script src="js/Setup-ajax.js" type="text/javascript"></script>
</head>
	<body>
		<form method="POST" action="addUser">
		帳號:<input type = "text" id = "account" name = "account" placeholder = "請輸入帳號"/><br>
		密碼:<input type = "text" id = "password" name = "password" placeholder = "請輸入密碼"/><br>
		名子:<input type = "text" id = "name" name = "name" placeholder = "請輸入名子"/>
		性別: <select id = "sex" name="sex">
					<option value=""></option>
					<option value="M">男</option>
					<option value="F">女</option>
				</select><br>
		信箱:<input type = "text" id = "email" name = "email" placeholder = "請輸入信箱"/><br>
		地址:<input type = "text" id = "address" name = "address" placeholder = "請輸入地址"/><br>
		<input type="submit" id = "setup" name="setup" value="註冊" >
		</form>
		<div name = "message" id="message"></div>
	</body>
</html>