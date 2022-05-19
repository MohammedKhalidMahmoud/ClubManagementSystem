package application;


public class employees extends Human{
      
	private int Years_Of_Experience;
	private double Salary;
	public employees(String first_Name,String last_Name,String age,String address,String ID_no,int Years_Of_Experience,double Salary) {
		super(first_Name,last_Name,age,address,ID_no);
		this.Years_Of_Experience=Years_Of_Experience;
		this.Salary=Salary;
	}
     
	@Override
	public void contents_display() {
		   System.out.println("Name : "+ this.first_Name+ " "+this.last_Name);
		   System.out.println("Age : "+this.age);
		   System.out.println("Address : "+ this.address);
		   System.out.println("ID_no : "+ this.ID_no);
		   System.out.println("Salary : "+ this.Salary);
		   System.out.println("Years_Of_Experience : "+ this.Years_Of_Experience);
	   }
	
}
