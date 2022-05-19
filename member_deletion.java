package application;

import java.sql.*; 

public class member_deletion extends Thread {
	private Customer customer;
   public void run() {
	
	try {
		customer = new Customer(Main.first_name,Main.last_name,Main.Age,Main.Address,Main.ID_no);
		Main.customer_list.remove(customer);
		System.out.println(Main.ID_no);
		Class.forName("com.mysql.jdbc.Driver");
	    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/clubmanagementdatabase?characterEncoding=latin1","root","sql123");
	    String command="delete from member where ID_no = ? ;";
	    PreparedStatement statement=connection.prepareStatement(command);
	    statement.setString(1,Main.ID_no );
	    statement.execute();
	}
catch(Exception e1) {
	System.out.println(e1.getMessage());
}
   }
}
