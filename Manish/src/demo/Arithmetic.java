package demo;

public class Arithmetic {

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
		//new
		
	}
	
	public int Mul(int a, int b)
	{
		int e=a*b;
		System.out.println("Mul is :"+e);
		return e;
	}
	
	public void Div(int a, int b)
	{
		int f=a/b;
		System.out.println("Result is :"+f);
		
	}	
	
	public static void main(String[] args) {
		Arithmetic manish= new Arithmetic();
		int Sum1=manish.Add(10, 2);
		int Sum2= manish.Add(Sum1, 2);
		int Sub= manish.Sub(Sum2, 2);
		int Mul= manish.Mul(Sub, 2);
		manish.Div(Mul, 2);		
		
	}

}
