package ru.unlimit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstlServlet")
public class JstlServlet extends HttpServlet{
	
	private static final long serialVersionUID = -5549012074152744410L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		//req.getRequestDispatcher("hello.jsp").forward(req, resp);
		//resp.sendRedirect("hello.jsp");
		
		Map<String, Integer> persons = new HashMap<>();
		persons.put("Mary", 25);
		persons.put("Max", 18);
		persons.put("Joanna", 25);
		
		req.setAttribute("persons", persons);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
	
}
