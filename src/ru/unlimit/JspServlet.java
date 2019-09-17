package ru.unlimit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JspServlet")
public class JspServlet extends HttpServlet{
	private static final long serialVersionUID = 8812280940798571732L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.getWriter().append("Served at: ").append(req.getContextPath());
		resp.getWriter().println("Hello");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
	}
	
}
