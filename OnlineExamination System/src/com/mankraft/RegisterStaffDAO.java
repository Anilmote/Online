package com.mankraft;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegisterStaffDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public static int save(RegisterStaff st) {

		int i = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/spring","root","ROOT");
			
			PreparedStatement pst = con.prepareStatement("insert into mktechno150(fname,lname,email,password,gender,qualify,date,experience) values(?,?,?,?,?,?,?,?)");
			
			pst.setString(1, st.getFname());
			pst.setString(2, st.getLname());
			pst.setString(3, st.getEmail());
			pst.setString(4, st.getPassword());
			pst.setString(5, st.getGender());
			pst.setString(6, st.getQualify());
			pst.setString(7, st.getDate());
			pst.setString(8, st.getExperience());
			i=pst.executeUpdate();
			
			System.out.println("updated successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
		return i;

	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
