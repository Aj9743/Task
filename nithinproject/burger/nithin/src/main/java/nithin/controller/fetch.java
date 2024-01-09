package nithin.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import nithin.dao.dao;
@WebServlet("/fetch")
public class fetch extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		 dao d=new dao();
		Object o= d.fetch(id1);
		res.getWriter().print(o);
		
	}

}
