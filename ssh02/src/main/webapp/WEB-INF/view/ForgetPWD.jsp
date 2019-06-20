<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="/jquery/jquery-1.11.1.min.js"></script>
<script>
</script>
</head>
<body>
	<form method="POST" action="sendMail">
		<table width="100" border="1">
			<tr>
				<td>信箱: <input type="text" id="memberEmail" name="memberEmail"
					placeholder="使用者信箱" />
				</td>
			</tr>
		</table>
		<input type="submit" id="find" name="find" value="發送Mail" />
	</form>

</body>
</html>