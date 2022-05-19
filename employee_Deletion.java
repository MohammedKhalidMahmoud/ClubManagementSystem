package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employee_Deletion extends Thread{
  
	public void run() {
		try {
			
			Customer customer = new Customer(Main.first_name,Main.last_name,Main.Age,Main.Address,Main.ID_no);
			Main.customer_list.remove(customer);
			System.out.println(Main.username);
			//System.out.println(GUI.password);
			Class.forName("com.mysql.jdbc.Driver");
		    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/clubmanagementdatabase?characterEncoding=latin1","root","sql123");
		    String command="delete from employee where username = ? ;";
		    PreparedStatement statement=connection.prepareStatement(command);
		    statement.setString(1,Main.username );
		    //statement.setString(2,GUI.password );
		    statement.execute();
		}
	catch(Exception e1) {
		System.out.println(e1.getMessage());
	}
	}
}

