package pkg1;

public class assignment3 {

	public assignment3()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	
	public assignment3(int a) {
		this();
		System.out.println("one parameterized");
	}
	
	public assignment3(int a, int b) {
		this(23);
		System.out.println("two parameterized");
	}
	
	public assignment3(int a, int b, int c) {
		System.out.println("three parameterized");
	}

	public static void main(String[] args) {
	
		assignment3 bipin=new assignment3(13,56);
		
	
	}
	
	
}
