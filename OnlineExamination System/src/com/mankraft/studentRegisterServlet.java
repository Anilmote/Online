package com.mankraft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class studentRegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String date=request.getParameter("date");
		
		studentRegister sr=new studentRegister();
		
		sr.setFname(fname);
		sr.setLname(lname);
		sr.setEmail(email);
		sr.setPassword(password);
		sr.setGender(gender);
		sr.setDate(date);
		
		int i=studentRegisterDAO.save(sr);
	}

}
