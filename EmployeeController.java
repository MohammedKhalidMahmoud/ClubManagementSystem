package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EmployeeController {

    @FXML
    private AnchorPane employee_remove_button;

    @FXML
    private TextField Employee_username_firld;

    @FXML
    private TextField Employee_password_field;

    @FXML
    private Button remove_button;

    @FXML
    private Button Employee_register_button;

    @FXML
    void Employee_remove(ActionEvent event) {
    	 Main.username=Employee_username_firld.getText();
    	 employee_Deletion E_D=new employee_Deletion();
    	 E_D.start();
    	 System.out.println("Done Successfully");
    }

    @FXML
    void employee_register(ActionEvent event) {
       Main.username=Employee_username_firld.getText();
       Main.password=Employee_password_field.getText();
       employee_Addition M_A= new employee_Addition() ;
       M_A.start();
       System.out.println("Done Successfully");
    }

}
