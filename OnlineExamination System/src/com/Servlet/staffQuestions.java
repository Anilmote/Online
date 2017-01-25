package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class staffQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	PrintWriter pw=response.getWriter();
    	
    	String que=getInitParameter("question");
    	String ans1=getInitParameter("ans1");
    	
    	
    	pw.print(que);
    	pw.print(ans1);
    	response.sendRedirect("success.html");
    
    	
	}

}
