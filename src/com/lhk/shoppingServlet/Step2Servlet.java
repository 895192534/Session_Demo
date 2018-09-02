package com.lhk.shoppingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Step2Servlet
 */
@WebServlet("/step2Servlet")
public class Step2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String information = request.getParameter("information");
		String cardNum = request.getParameter("cardNum");
		String cardType = request.getParameter("cardType");
		
		Customer customer = new Customer(name, address, information, cardType, cardNum);
		
		session.setAttribute("customer", customer);
		
		response.sendRedirect(request.getContextPath()+"/shopping/confirm.jsp");
	}

}
