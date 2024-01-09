package nithin.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import nithin.dao.dao;
import nithin.dto.dto;
@WebServlet("/insert")
public class controller  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
String id=req.getParameter("id");
int id1=Integer.parseInt(id);
String email=req.getParameter("email");
String phone=req.getParameter("phone");
String username=req.getParameter("username");
String password=req.getParameter("password");
String  street=req.getParameter("street");
String city=req.getParameter("city");
String state=req.getParameter("state");
String zip=req.getParameter("zip");
String country=req.getParameter("country");
Long phone1=Long.parseLong(phone);
 int zip1=Integer.parseInt(zip);
 dto dto=new dto();
dto.setId(id1);
 dto.setEmail(email);
 dto.setPhno(phone1);
 dto.setUser_name(username);
 dto.setPassword(password);
 dto.setState(state);
 dto.setCity(city);
 dto.setZip(zip1);
 dto.setCountry(country);
 dao dao=new dao();
 dao.insert(dto);
 

		
	}

}
