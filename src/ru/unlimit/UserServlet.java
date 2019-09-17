package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet{

	private static final long serialVersionUID = 6709770926753600311L;
	private Map<Integer, String> users = new ConcurrentHashMap<>();
	private AtomicInteger counter;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		users.put(1, "Vanya");
		users.put(2, "Ivan");
		users.put(3, "Vova");
		counter = new AtomicInteger();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String user = users.get(id);
		if(user == null) {
			user = "";
		}
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<h3>user: " + user + "</h3><br>");
		out.print("<a href='javascript:history.back()'>Назад</a>");
		out.close();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		Integer id = null;
		if(!users.containsValue(name)) {
			id = counter.incrementAndGet();
			users.put(id, name);
		}
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if(id == null) {
			out.println("<h3>user " + name + " уже существует</h3>");
		} else {
			out.println("<h3>создан user " + name + " с id = " + counter.get() + "</h3>");
		}
		out.print("<br>");
		out.println("<a href='http://localhost:8080/WebApp/user.html'>На главную</a>");
		out.close();
	}
	
}
