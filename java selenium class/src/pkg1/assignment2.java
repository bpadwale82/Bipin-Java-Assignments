package pkg1;

public class assignment2 {

	public int add (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub (int a, int b) 
	{
		int c;
		c=a-b;
		return c;
	}
	public int mul (int a, int b) 
	{
		int c;
		c=a*b;
		return c;
	}
	
	public void div (int a, int b)
	{
		int c;
		c=a/b;		
		System.out.println("Result is " + c);
	}
	
public static void main(String[] args) {
	assignment2 bipin=new assignment2();
int r1=bipin.add(10, 2);
int r2=bipin.add(r1, 2);
int r3=bipin.sub(r2, 2);
int r4=bipin.mul(r3, 2);
bipin.div(r4, 2);

}


}
