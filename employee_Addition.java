package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employee_Addition extends Thread {

	@Override
	public void run() {
		try {
			
			// System.out.println(GUI.username +" "+ GUI.password);
		Class.forName("com.mysql.jdbc.Driver");
	    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/clubmanagementdatabase?characterEncoding=latin1","root","sql123");
	    String command="insert into employee values(?,?);"; 
	    PreparedStatement statement=connection.prepareStatement(command);
	    statement.setString(1,Main.username );
	    statement.setString(2,Main.password );
	    statement.execute();
	}
catch(Exception e1) {
	System.out.println(e1.getMessage());
}
}
	
}

