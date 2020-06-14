package demo;

import java.util.Scanner;

public class Scanner_Assignment {
	
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
		
	}
	
	public int sub(int a, int b)
	{
		int d;
		d=a-b;
		return d;
		
	}
	
	public int mul(int a, int b)
	{
		int e;
		e=a*b;
		return e;
		
	}
	
	public void div(int a, int b)
	{
		int f;
		f=a/b;
		System.out.println("Result of this expression is"+f);
		
	}
	
	public static void main(String[] args) {
		Scanner_Assignment obj= new Scanner_Assignment();
		Scanner m= new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1= m.nextInt();
		
		System.out.println("Enter the value of x2");
		int x2= m.nextInt();
		
		int add=obj.add(x1, x2);
		
		System.out.println("Enter the value of x3");
		int x3= m.nextInt();
		
		int sub=obj.sub(add, x3);
				
		System.out.println("Enter the value of x4");
		int x4= m.nextInt();
		
		int sum=obj.add(sub, x4);
		
		System.out.println("Enter the value of x5");
		int x5= m.nextInt();
		
		int mul=obj.mul(sum, x5);
		
		System.out.println("Enter the value of x6");
		int x6= m.nextInt();
		
		obj.div(mul, x6);
		
		
		
		
	}
	
	

}
