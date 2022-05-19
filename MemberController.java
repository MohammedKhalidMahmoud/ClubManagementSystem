package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MemberController {

    @FXML
    private TextField Member_firstname_field,Memebr_lastname_field,Member_Age_field,Member_Address_field,Member_ID_no_field;
  
  
   
    @FXML
    private Button Member_register_button,Member_remove_button;

    @FXML
    void Member_register(ActionEvent event) {
      Main.first_name=Member_firstname_field.getText();
      Main.last_name=Memebr_lastname_field.getText();
      Main.Address=Member_Address_field.getText();
      Main.ID_no=Member_ID_no_field.getText();
      Main.Age=Member_Age_field.getText();
      member_addition M_A=new member_addition();
      M_A.start();
    }

    @FXML
    void Member_remove(ActionEvent event) {
    	Main.ID_no=Member_ID_no_field.getText();
    	member_deletion M_D = new member_deletion();
    	M_D.start();
    }

}
