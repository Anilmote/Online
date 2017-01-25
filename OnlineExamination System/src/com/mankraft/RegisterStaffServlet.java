package com.mankraft;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegisterStaffServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		java.io.PrintWriter out=response.getWriter();
		
	     String fname=request.getParameter("fname");
	     String lname=request.getParameter("lname");
	     String email=request.getParameter("email");
	     String password=request.getParameter("password");
	     String gender=request.getParameter("gender");
	     String qualify=request.getParameter("qualify");
	     String date=request.getParameter("date");
	     String experience=request.getParameter("experience");
	    
	     RegisterStaff st=new RegisterStaff();
	     
	     st.setFname(fname);
	     st.setLname(lname);
	     st.setEmail(email);
	     st.setPassword(password);
	     st.setGender(gender);
	     st.setQualify(qualify);
	     st.setDate(date);
	     st.setExperience(experience);
		
		int i=RegisterStaffDAO.save(st);
	}

}