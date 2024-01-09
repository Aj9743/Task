package nithin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import nithin.dao.dao;
import nithin.dto.dto;
@WebServlet("/delete")
public class delete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		dao dao=new dao();
		dao.delete(cid);
		
		
		
		
		
	}
	}


