<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/register">Add User</a>
	<br>
	<h3>List of all users</h3>
	${message}
	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>名子</th>
				<th>信箱</th>
				<th>密碼</th>
				<th>地址</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.memberName}</td>
					<td>${user.memberEmail}</td>
					<td>${user.password}</td>
					<td>${user.address}</td>
					<td><a
						href="${pageContext.request.contextPath}/editUser/${user.memberId}">Edit</a></td>
					<td><a
						href="${pageContext.request.contextPath}/deleteUser/${user.memberId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>