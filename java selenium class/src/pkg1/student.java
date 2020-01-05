package pkg1;

public class student {
	
	int age;
	int roll_no;
	
	public void display1 () 
	{
	System.out.println("Welcome to all");	
	}
	
	
	public void display2 () 
	{
	System.out.println("Automation is in demand");
	}
	
	public static void main(String[] args) {
	student bipin=new student();
	bipin.age=35;
	bipin.roll_no=3;
	bipin.display1();
	bipin.display2();
	System.out.println(bipin.age);
	System.out.println(bipin.roll_no);
	}
		

}
