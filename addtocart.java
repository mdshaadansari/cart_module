package com.jtc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "addtocart", urlPatterns = {"/addtocart", "/removetocart"})
public class addtocart extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
//		String blist= req.getParameter("bname");
//		List list=new ArrayList();
//		
//			list.add(blist);
//			
//			HttpSession session=req.getSession();
//			session.setAttribute("MyCart",list);
//		
//			
//			System.out.println(list);
//			RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
//			rd.forward(req, res);
//		--------------------------
			
		//1 collect the data
		
		String bname=req.getParameter("bname");
		String removebname=req.getParameter("removebname");
		System.out.println(bname);
		
		HttpSession session=req.getSession();
		
		List<String> mycart=(List<String>) session.getAttribute("MyCart");
		if(bname!=null) {
		mycart.add(bname);
		session.setAttribute("showcart", mycart);
		System.out.println(mycart);
		
		RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
		rd.forward(req, res);
		
		//---------------------------------------------------
		
//		for(Object o:mycart) {
//			String oo=(String)o;
//			if(oo.equals(removebname)) {
//				
//			}
		
		}else if(mycart.contains(removebname)) {
			mycart.remove(removebname);
			RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
			rd.forward(req, res);
				
		}else if(!mycart.contains(removebname)) {
			
			RequestDispatcher rd=req.getRequestDispatcher("courselist.jsp");
			rd.forward(req, res);
				
		}
		 
			
		
		
	}

}
