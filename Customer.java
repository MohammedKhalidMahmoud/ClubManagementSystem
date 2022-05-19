package application;



public class Customer extends Human{
	private String membership_no;
	
	public Customer(String first_Name,String last_Name,String age,String address,String ID_no) {
		super(first_Name,last_Name,age,address,ID_no);
		this.membership_no=membership_no;
	}
	
	@Override
	public void contents_display() {
		   System.out.println("Name : "+ this.first_Name+ " "+this.last_Name);
		   System.out.println("Age : "+this.age);
		   System.out.println("Address : "+ this.address);
		   System.out.println("ID_no : "+ this.ID_no);
		   System.out.println("Membersip_no : "+ this.membership_no);
	   }
	 
    public void membership_modification(String membership_no) {
    	this.membership_no=membership_no;
    }
}
