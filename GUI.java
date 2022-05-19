package application;

/*
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

// import com.mysql.cj.protocol.Resultset; //To be able to handle data retreived from database

import java.util.ArrayList;
import java.awt.Label;
import java.sql.*; // importing classes needed for JDBC 

public class GUI extends Application implements EventHandler,login{
	
	 I had to declare Variables used in GUI as global variables 
	 * to be able to access them freely and being restricted to a specified scope
	 */
	/*public static ArrayList <Customer> customer_list =new ArrayList<Customer>();
	public static ArrayList <employees> employee_list =new ArrayList<employees>();
	public static String first_name,last_name,Age,ID_no,Address;
	public static String username,password;
	*/
	/*Stage window;
	Label Login_username_label;
	Label Login_password_label ;
	TextField Login_username_field;
	PasswordField Login_password_field;
	Button Login_button,new_employee,member_register,member_delete,employee_register,employee_delete ;
	*/
	
	/* Function that handles the login form and gives the access only to the adminstrators 
	 * that have a record in the database
	 */
/*	public static void Log_in_frame() {  
		
		}
	
public static void Sign_up_frame() {
	
}

public void new_employee_frame() {
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==Login) {
		boolean found=verify_user();
		if(found) {
			login_frame.dispose();
			Sign_up_frame();
		}
		else {
			Accessdenied_label.setVisible(true);
		}
				
		}
	else if(e.getSource()==new_employee) {
		new_employee_frame();
	}
	else if(e.getSource()==member_register) {
		first_name=member_first_Name_textfield.getText();
		last_name=member_last_Name_textfield.getText();
		Age=member_Age_field.getText();
		ID_no=member_ID_no_field.getText();
		Address=member_Address_Field.getText();
		// System.out.println(first_name+ " "+ last_name+ " "+Age+" "+ ID_no+ " "+ Address);
		member_addition M_A= new member_addition();
		M_A.start();
		//frame2.dispose();
	}
	else if(e.getSource()==member_delete) {
		ID_no=member_ID_no_field.getText();
		System.out.println(ID_no);
		member_deletion M_D = new member_deletion();
		M_D.start();
	}
	else if(e.getSource()==employee_register) {
		username=employee_username_field.getText();
		password=employee_password_field.getText();
		// System.out.println(username +" "+ password);
		employee_Addition E_A=new employee_Addition();
		E_A.start();
	}
	else if(e.getSource()==employee_delete) {
		username=employee_username_field.getText();
		//password=employee_password_field.getText();
		employee_Deletion E_D=new employee_Deletion();
		E_D.start();
	}
}

public boolean verify_user()
{
	boolean found= false;
	String username=login_username_field.getText();
	String password=login_Password_field.getText();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/clubmanagementdatabase?characterEncoding=latin1","root","sql123");
		    String command="select * from employee ;";
		    Statement statement=connection.createStatement();
		    ResultSet result=statement.executeQuery(command);
		    while(result.next()) {
		    	if(result.getString(1).contentEquals(username)  && result.getString(2).equals(password)) {
		    		found=true;
		    		break;
		    	}
		    }
		    connection.close();
		
	}
	catch(Exception e1) {
		System.out.println(e1.getMessage());
	}
		return found;
}

@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	try {
		window =primaryStage;
		window.setTitle("Login");
		GridPane grid=new GridPane();
		Login_username_label= new Label("username");
		Login_password_label= new Label("password");
		grid.add(Login_username_label, 0, 0);
	    
	} catch(Exception e) {
		System.out.println("3");
		e.printStackTrace();
	}
}
@Override
public void handle(Event event) {
	// TODO Auto-generated method stub
	if(event.getSource()==Login_button) {
       
	}
}

*/



