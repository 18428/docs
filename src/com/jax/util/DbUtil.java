package com.jax.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private String dbUrl="jdbc:postgresql://localhost:15432/docs";
	private String dbUserName="odoo";
	private String dbPassword="odoo";
	private String jdbcName="org.postgresql.Driver";
	
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;	
	}
	
	public void closeCon(Connection con) throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("-------------conn success-------------");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
