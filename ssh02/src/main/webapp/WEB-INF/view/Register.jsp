<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:useBean id="command" class="com.clear.model.Member" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>註冊畫面</title>
<script src="//code.jquery.com/jquery-1.10.2.js"
type="text/javascript"></script>
<script src="js/Setup-ajax.js" type="text/javascript"></script>

</head>
	<body>
	 <form:form method="POST" action="addUser">
             <table>
             	<tr>
                    <td><form:label path="memberId">ID:</form:label></td>
                    <td><form:input path="memberId"/></td>
                </tr>
                <tr>
                    <td><form:label path="memberName">帳號:</form:label></td>
                    <td><form:input path="memberName"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">密碼:</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="memberEmail">信箱:</form:label></td>
                    <td><form:input path="memberEmail"/></td>
                </tr>
                <tr>
                    <td><form:label path="address">地址:</form:label></td>
                    <td><form:input path="address"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
	</body>
</html>