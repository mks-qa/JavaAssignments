package demo;

public class Arithmetic2 {

	public int Add(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum is :"+c);
		return c;
		
	}
	
	public int Sub(int a, int b)
	{
		int d= a-b;
		System.out.println("Sub is :"+d);
		return d;
		
	}
	
	public void Mul(int a, int b)
	{
		int e=a*b;
		System.out.println("Result is :"+e);
		
	}
	
	public int Div(int a, int b)
	{
		int f=a/b;
		System.out.println("Div is :"+f);
		return f;
		
	}
	
	
	public static void main(String[] args) {
		Arithmetic2 manish= new Arithmetic2();
		int Div=manish.Div(10, 2);
		int Sum= manish.Add(Div, 2);
		int Sub= manish.Sub(Sum, 2);
		int Sub2= manish.Sub(Sub, 2);
		manish.Mul(Sub2, 2);
				
	}

}
