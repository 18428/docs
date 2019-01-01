package com.jax.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jax.util.DbUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DbUtil dbUtil=new DbUtil();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("----------doPost------------");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		Connection con=null;
		Statement stmt=null;
		try {
			con=dbUtil.getCon();
			stmt = con.createStatement();
			String sql = "CREATE TABLE COMPANY9 " +
                      "(ID INT PRIMARY KEY     NOT NULL," +
                      " NAME           TEXT    NOT NULL, " +
                      " AGE            INT     NOT NULL, " +
                      " ADDRESS        CHAR(50), " +
                      " SALARY         REAL)";
          stmt.executeUpdate(sql);
          stmt.close();
          con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		Connection c = null;
//	    Statement stmt = null;
//        try {
//          Class.forName("org.postgresql.Driver");
//          c = DriverManager.getConnection("jdbc:postgresql://localhost:15432/docs","odoo", "odoo");
//          System.out.println("Opened database successfully");
//
//          stmt = c.createStatement();
//          String sql = "CREATE TABLE COMPANY1 " +
//                      "(ID INT PRIMARY KEY     NOT NULL," +
//                      " NAME           TEXT    NOT NULL, " +
//                      " AGE            INT     NOT NULL, " +
//                      " ADDRESS        CHAR(50), " +
//                      " SALARY         REAL)";
//          stmt.executeUpdate(sql);
//          System.out.println("Table created successfully");
//          stmt.close();
//          c.close();
//        } catch ( Exception e ) {
//          System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//          System.exit(0);
//        }
	    
		
		if("jax".equals(userName)&&"jax".equals(password)) {
			System.out.println("-----------login success-------------");
//			request.setAttribute("user", userName);
			HttpSession session = request.getSession();
			session.setAttribute("user", userName);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
