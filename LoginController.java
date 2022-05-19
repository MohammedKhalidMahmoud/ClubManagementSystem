package application;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private TextField Login_username_field;

    @FXML
    private TextField Login_password_field;

    @FXML
    private Button Login_button;
    
    @FXML
    private Button new_employee_button;
    
    @FXML
    void new_employee_method(ActionEvent event) {
    	try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("employee_page.fxml"));
			Scene scene = new Scene(root,400,400);
			Main.ApplicationWindow.setScene(scene);
		} catch(Exception e) {
			System.out.println(1);
			e.printStackTrace();
		}
    }
    
    @FXML
    void Login_process(ActionEvent event) {
    	boolean found=verify_user();
    	if(found) {
    		try {
    			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("member_page.fxml"));
    			Scene scene = new Scene(root,400,400);
    			Main.ApplicationWindow.setScene(scene);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
		}
		else {
			System.out.println("not found");
		}	
    	}
    
    
    public boolean verify_user()
    {
    	boolean found= false;
    	String username=Login_username_field.getText();
    	String password=Login_password_field.getText();
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

}
