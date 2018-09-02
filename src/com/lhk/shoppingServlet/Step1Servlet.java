package com.lhk.shoppingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Step1Servlet
 */
@WebServlet("/step1Servlet")
public class Step1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		//1. 获取选中的图书的信息
		String[] bookNames = request.getParameterValues("book");
		
		//2. 把图书信息放入到 HttpSession 中
		session.setAttribute("bookNames", bookNames);
		
		//3. 重定向页面到 shopping/step-2.jsp  绝对路径
		response.sendRedirect(request.getContextPath()+"/shopping/step-2.jsp");
	}
}
