<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery-1.10.2.js"
type="text/javascript"></script>
<script src="js/Find.js" type="text/javascript"></script>
<title>人員查詢作業</title>

</head>
<body>
	<form>
		<table width="400" border="1">
			<tr>
				<td>性別: <select id = "sex" name="sex">
					<option value=""></option>
					<option value="M">男</option>
					<option value="F">女</option>
				</select>
				</td>
				<td>帳號: <input type="text" id="account" name="account"
					placeholder="使用者帳號" />
				</td>
				<td>名子: <input type="text" id="name" name="name"
					placeholder="使用者名子" />
				</td>
				<td>信箱: <input type="text" id="email" name="email"
					placeholder="使用者信箱" />
				</td>
				<td>地址: <input type="text" id="address" name="address"
					placeholder="使用者地址" />
				</td>
			</tr>
		</table>
		<input type="button" id="find" name="find" value="查詢" />
	</form>
	 <div id="anotherSection">
 
            <!-- 用來顯示Ajax回傳值的fieldset -->
 
         <fieldset>

             <div id="ajaxResponse"></div>
 
         </fieldset>
 
        </div> 
</body>

</html>