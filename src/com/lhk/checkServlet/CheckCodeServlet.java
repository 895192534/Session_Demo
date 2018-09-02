package com.lhk.checkServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckCodeServlet
 */
@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		//1. 获取请求参数: CHECK_CODE
		String paramCode = request.getParameter("CHECK_CODE");
		
		//2. 获取 session 中的 CHECK_CODE_KEY 属性值
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
		
		//3. 比对. 看是否一致, 若一致说明验证码正确, 若不一致, 说明验证码错误
		if(paramCode != null && paramCode.equals(sessionCode)) {
			System.out.println("验证通过!");
		}else {
			request.getSession().setAttribute("message", "验证码不一致!");
			response.sendRedirect(request.getContextPath()+"/check/index.jsp");
		}
	}

}
