<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>登入成功</title>
</head>
<body>
		<form>
		 登入成功<br>
		 <input type="button" name="subm" value="返回登入頁面" onclick="backLogin()">
			<script language="javascript">
			function backLogin(){
				  window.history.back();
			}
			</script>
		</form>
	</body>
</html>