package com.src.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.src.model.LoginModel;
import com.src.model.RegisterModel1;

public class dbimp implements dbintr1{
	private static Connection con;
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}
	public int insertToDb(RegisterModel1 rm1) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt=con.prepareStatement("insert into registration values(?,?,?)");
		stmt.setString(1,rm1.getUsername());
		stmt.setInt(2,rm1.getAge());
		stmt.setString(3,rm1.getPassword());
		return stmt.executeUpdate();
	}
	
	
	public boolean CheckLogin(LoginModel ln)throws 	SQLException{
		String query="select name from registration where name='"+ln.getUsername()+"' and password='"+ln.getPassword()+"'"; 
				Statement statement=con.createStatement();
				System.out.println(query);
				
				ResultSet rs=statement.executeQuery(query);
				return rs.next();
	}

}
