<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>step2:请输入寄货地址与信用卡信息</h2>
	<form action="<%=request.getContextPath() %>/step2Servlet" method="post">
		<table cellpadding="10" cellspacing="0" border="1">
			<tr>
				<td colspan="2">基本信息</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>寄送地址</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>信用卡信息</td>
				<td><input type="text" name="information"/></td>
			</tr>
			<tr>
				<td >种类</td>
				<td>
					<input type="radio" name="cardType" value="Visa" />Visa
					<input type="radio" name="cardType" value="Master" />Master
				</td>
			</tr>
			<tr>
				<td>卡号</td>
				<td><input type="text" name="cardNum"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form>
</body>
</html>