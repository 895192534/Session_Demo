<%@page import="com.lhk.shoppingServlet.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Customer customer = (Customer)session.getAttribute("customer");
		String[] bookNames = (String[])session.getAttribute("bookNames");
	%>
	
	
	<h2>step3:订单确认</h2>
		<table cellpadding="10" cellspacing="0" border="1">
			<tr>
				<td>顾客姓名</td>
				<td><%=customer.getName() %></td>
			</tr>
			<tr>
				<td>寄送地址</td>
				<td><%=customer.getAddress() %></td>
			</tr>
			<tr>
				<td>信用卡信息</td>
				<td><%=customer.getInformation() %></td>
			</tr>
			<tr>
				<td>信用卡类型</td>
				<td><%=customer.getCardType() %></td>
			</tr>
			<tr>
				<td>卡号</td>
				<td><%=customer.getCardNum() %></td>
			</tr>
			<tr>
				<td>订货项目</td>
				<td>
					<%for(String book:bookNames) {
						out.print(book+"</br>");
					}%>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"/></td>
			</tr>
		</table>
</body>
</html>