package application;


public class Human {
   protected String first_Name;
   protected String last_Name;
   protected String age;
   protected String address;
   protected String ID_no;
   
   public Human(String first_Name,String last_Name,String age,String address,String ID_no) {
       this.first_Name=first_Name;
       this.last_Name=last_Name;
       this.age=age;
       this.address=address;
       this.ID_no=ID_no;
       
   }
   
  
public void contents_display() {
	   System.out.println("Name : "+ this.first_Name+ " "+this.last_Name);
	   System.out.println("Age : "+this.age);
	   System.out.println("Address : "+ this.address);
	   System.out.println("ID_no : "+ this.ID_no);
   }

  
  public void Age_modification(String age) {
	  this.age=age;
  }
  public void Adress_modification(String Adress) {
	 this.address=Adress;
  }

}

