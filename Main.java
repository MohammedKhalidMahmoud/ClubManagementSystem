package application;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	public static ArrayList <Customer>customer_list=new ArrayList<Customer>();
	public static ArrayList <employees> employee_list= new ArrayList <employees>();
	public static String first_name,last_name,Age,Address,ID_no;
	public static String username,password;
	public static Stage ApplicationWindow;
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login_page.fxml"));
			Scene scene = new Scene(root,400,400);
			ApplicationWindow=primaryStage;
			ApplicationWindow.setScene(scene);
			ApplicationWindow.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
