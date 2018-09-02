<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		SessionId: <%=session.getId()%>
		<br><br>
		
		IsNew: <%=session.isNew() %>
		<br><br>
		
		MaxInactiveInterval: <%=session.getMaxInactiveInterval() %>
		<br><br>
		
		CreateTime: <%=session.getCreationTime() %>
		<br><br>
		
		LastAccess: <%=session.getLastAccessedTime() %>
		<br><br>
		
		Bye: <%= request.getAttribute("username") %>
		<br><br>
		
		<a href="login.jsp">重新登录</a>
		<%
			session.invalidate(); // 销毁Session
		%>
</body>
</html>