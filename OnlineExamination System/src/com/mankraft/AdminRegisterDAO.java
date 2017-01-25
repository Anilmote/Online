package com.mankraft;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminRegisterDAO extends HttpServlet {

	public static int save(AdminRegister ad) {
		int i = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/spring", "root", "ROOT");
			PreparedStatement pst = con.prepareStatement("insert into mktechno140(fname,lname,email,password,gender,qualify) values(?,?,?,?,?,?)");

			pst.setString(1, ad.getFname());
			pst.setString(2, ad.getLname());
			pst.setString(3, ad.getEmail());
			pst.setString(4, ad.getPassword());
			pst.setString(5, ad.getGender());
			pst.setString(6, ad.getQualify());

			i = pst.executeUpdate();
			System.out.println("successfully updated");

		} catch (Exception e) {
			System.out.println(e);
		}

		return i;
	}

}
