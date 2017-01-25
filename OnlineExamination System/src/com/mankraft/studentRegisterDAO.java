package com.mankraft;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class studentRegisterDAO extends HttpServlet {
	
	public static int save(studentRegister sr){
		
		int i=0;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/spring","root","ROOT");
			PreparedStatement pst=con.prepareStatement("insert into mktechno130(fname,lname,email,password,gender,date) values(?,?,?,?,?,?)");
		
			pst.setString(1, sr.getFname());
			pst.setString(2, sr.getLname());
			pst.setString(3, sr.getEmail());
			pst.setString(4, sr.getPassword());
			pst.setString(5, sr.getGender());
			pst.setString(6, sr.getDate());

			i=pst.executeUpdate();
			System.out.println("updated successfully");
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		return i;
	}
}
