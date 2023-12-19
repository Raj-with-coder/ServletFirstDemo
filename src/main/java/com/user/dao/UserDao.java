package com.user.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.DatabaseConnection;

public class UserDao 
{
	public static boolean userRegistration(String uname,String uid, String upass, String city, String mob) //method
	{
		boolean flag = false;
		Statement st= null;
		Connection con= null;
		
		try
		{
			con = DatabaseConnection.databaseConnector();
			
			st= con.createStatement();
			String query = "insert into m_user(user_name,user_id,user_password,user_mob,user_city)"+ ""+ "values"+ ""+ "('"+uname+"','"+uid+"','"+upass+"','"+city+"','"+mob+"')";
			int n= st.executeUpdate(query);
			if(n!=0)
			{
				flag=true;
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return flag;
	}
	
	
	// new methode user login ka hai
	
	public static boolean userLogin(String uid,String upass)
	{
		boolean flag= false;
		
		Connection con=null;
		Statement st= null;
		ResultSet rs= null;
		
		try
		{
			con = DatabaseConnection.databaseConnector();
			st = con.createStatement();
			String query = "select * from m_user where user_id='"+uid+"'and user_password='"+upass+"'";
			rs=st.executeQuery(query);
			if(rs.next())
			{
				flag=true;
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return flag;
	}
	
	// admin login mathode
	
	public static boolean adminLogin(String aid,String apass)
	{
		boolean flag= false;
		
		Connection con=null;
		Statement st= null;
		ResultSet rs= null;
		
		try
		{
			con = DatabaseConnection.databaseConnector();
			st = con.createStatement();
			String query = "select * from m_admin where admin_id='"+aid+"'and admin_password='"+apass+"'";
			rs=st.executeQuery(query);
			if(rs.next())
			{
				flag=true;
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return flag;
	}
}
