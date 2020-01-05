package pkg1;

public class assignment4 {

	public void method1() 
	{
		System.out.println("Default Method");
		this.method2();
	}
	
	
	public void method2() 
	{
		System.out.println("One Parameterized");
		this.method3();
	}
	
	public void method3()
	{
		System.out.println("Two Parameterized");
	
	}

	public void method4() 
	{
	
	System.out.println("Three Parameterized");	
	this.method1();
	}

public static void main(String[] args) 
{
	
	assignment4 bipin=new assignment4();
	bipin.method4();
	
}
	
	
}

