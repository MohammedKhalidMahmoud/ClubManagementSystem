package application;


import java.util.ArrayList;
import java.sql.*;
public class member_addition extends Thread{
	private Customer customer;
	@Override 
	public void run() {
		try {
			customer = new Customer(Main.first_name,Main.last_name,Main.Age,Main.Address,Main.ID_no);
			Main.customer_list.add(customer);
			System.out.println(Main.first_name+ " "+ Main.last_name+ " "+Main.Age+" "+ Main.ID_no+ " "+ Main.Address);
			
			Class.forName("com.mysql.jdbc.Driver");
		    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/clubmanagementdatabase?characterEncoding=latin1","root","sql123");
		    String command="insert into member values(?,?,?,?,?);"; 
		    PreparedStatement statement=connection.prepareStatement(command);
		    statement.setString(1,Main.first_name );
		    statement.setString(2,Main.last_name );
		    statement.setString(3,Main.Age );
		    statement.setString(4,Main.Address );
		    statement.setString(5,Main.ID_no );
		    
		    statement.execute();
		}
	catch(Exception e1) {
		System.out.println("3422");
		System.out.println(e1.getMessage());
	}
	}
}

