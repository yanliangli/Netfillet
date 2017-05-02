package com.repository.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeData {
	
	
	public static Connection createConnection() throws SQLException{
		String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/NETFLIX";
	      try {
			Class.forName(myDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      Connection conn = DriverManager.getConnection(myUrl, "root", "password");
	      return conn;
	}
	
	
	
	public static String firstName(int employeeId){
		
		int ssn = ssn(employeeId);
		String firstName = "";
	    try
	    {
	      String query = "SELECT * FROM Person WHERE SSN = '"+ssn+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        firstName = rs.getString("FirstName");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return firstName;
	  }
	
	public static String lastName(int employeeId){
			
			int ssn = ssn(employeeId);
			String lastName = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE SSN = '"+ssn+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        lastName = rs.getString("LastName");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return lastName;
		  }
	
	public static String address(int employeeId){
			
		int ssn = ssn(employeeId);	
		String address = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE SSN = '"+ssn+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        address = rs.getString("Address");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return address;
		  }
	
	public static int zipcode(int employeeId){
		
		int ssn = ssn(employeeId);
		int zipcode = 0;
	    try
	    {
	      String query = "SELECT * FROM Person WHERE SSN = '"+ssn+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        zipcode = rs.getInt("Zipcode");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return zipcode;
	  }
	
	public static String telephone(int employeeId){
			
		int ssn = ssn(employeeId);	
		String telephone = "";
		    try
		    {
		      String query = "SELECT * FROM Person WHERE Id = '"+ssn+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        telephone = rs.getString("Telephone");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return telephone;
		  }
	
	public static String state(int employeeId){
			
			int zipcode = zipcode(employeeId);
			
			String state = "";
		    try
		    {
		      String query = "SELECT * FROM Location WHERE ZipCode = '"+zipcode+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        state = rs.getString("State");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return state;
	  }
	
	public static String city(int employeeId){
		
		int zipcode = zipcode(employeeId);
		
		String city = "";
	    try
	    {
	      String query = "SELECT * FROM Location WHERE ZipCode = '"+zipcode+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        city = rs.getString("City");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return city;
  }
	
	public static String startDate(int employeeId){
			
			String startDate = "";
		    try
		    {
		      String query = "SELECT * FROM Employee WHERE Id = '"+employeeId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        startDate = rs.getString("StartDate");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return startDate;
		  }
	
	public static int hourlyRate(int employeeId){
			
			int hourlyRate = 0;
		    try
		    {
		      String query = "SELECT * FROM Employee WHERE Id = '"+employeeId+"' ";
		      Statement st = createConnection().createStatement();
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next())
		      {
		        hourlyRate = rs.getInt("hourlyRate");
		        }
		      st.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		    
		    return hourlyRate;
		  }
	
	public static int ssn(int employeeId){
		
		int ssn = 0;
	    try
	    {
	      String query = "SELECT * FROM Employee WHERE Id = '"+employeeId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        ssn = rs.getInt("SSN");
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return ssn;
	  }
	
public static boolean isManager(int employeeId){
		
		boolean status = false;
		String x = "";
	    try
	    {
	      String query = "SELECT * FROM Employee WHERE Id = '"+employeeId+"' ";
	      Statement st = createConnection().createStatement();
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next())
	      {
	        x = rs.getString("position");
	        if(x.equals("m"))
	        	status = true;
	        }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	    
	    return status;
	  }

	
	
	
	
	
	
	
	
	


	
}


