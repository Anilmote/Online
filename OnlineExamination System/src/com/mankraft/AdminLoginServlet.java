package com.mankraft;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLoginServlet extends HttpServlet implements Servlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try{
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/spring","root","ROOT");
				PreparedStatement ps=con.prepareStatement("select email,password from mktechno140 where email=? and password=?");
				
				ps.setString(1,email);
				ps.setString(2,password);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()){
					response.sendRedirect("AdminLoginSuccess.html");
				}else{
					response.sendRedirect("AdminLoginError.html");
				}
				rs.close();
				ps.close();
				con.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
