package Polymorphism;

public class   {
	
	public void add() // 0 parameter
	{
		System.out.println(100+200);
	}
	
	public void add(int a , int b) // 2 parameter
	{
		System.out.println(a+ b);
	}
	public void add(int a , int b, int c) // 3 parameter
	{
		System.out.println(a+b+c);
	}
	
	//2.change different type of parameter
	public void add(double a , int b) // 2 parameter
	{
		System.out.println(a+b);
	}
	public void add(int a , double b) // 2 parameter
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) 
	{ 
			compileTimePoly c1=new compileTimePoly();
			c1.add();
			c1.add(100.11, 200);
			c1.add(10, 100);
			c1.add(10, 210.9);
			c1.add(20,30,40);
			
			

	}

}
