package com.jtc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class addbookservlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
	
	String cat=req.getParameter("category");
	List<String> booklist=new ArrayList<>();
	HttpSession session=req.getSession();
	System.out.println(cat);
	
	
	
	List<String> mycart1=(List<String>) session.getAttribute("MyCart");
	if(mycart1==null) {
		List<String> mycart=new ArrayList<>();
		session.setAttribute("MyCart", mycart);
	}
	
	
	
	
	
	if(cat.equals("java")) {
		booklist.add("java 1");
		booklist.add("java 2");
		booklist.add("java 3");
		booklist.add("java 4");
	session.setAttribute("mycart", booklist);
	RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
	rd.forward(req, res);
	
	
	}else if(cat.equals("python")) {
		booklist.add("python1");
		booklist.add("python2");
		booklist.add("python3");
		session.setAttribute("mycart", booklist);
		RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
		rd.forward(req, res);	
	
	}else if(cat.equals("web")) {
		req.setAttribute("mycart", "books not available now");
		
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);
	}else if(cat==null||cat.length()==0) {
		req.setAttribute("mycart", "please select course to see available books");
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);
	}
}
}

