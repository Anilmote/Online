package com.mankraft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminRegisterServlet extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out=response.getWriter();
		     
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String email=request.getParameter("email");
		    String password=request.getParameter("password");
		    String gender=request.getParameter("gender");
		    String qualify=request.getParameter("qualify");
		 
		     AdminRegister ad=new AdminRegister();
		     
		     ad.setFname(fname);
		     ad.setLname(lname);
		     ad.setEmail(email);
		     ad.setPassword(password);
		     ad.setGender(gender);
		     ad.setQualify(qualify);
		     
		     int i=AdminRegisterDAO.save(ad);
		}

	}
