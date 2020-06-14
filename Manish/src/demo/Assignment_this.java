package demo;

public class Assignment_this {
	
	public void Default_method()
	{
		System.out.println("Default Method");
		this.Single_ParamMethod(10);
	}
	
	public void Single_ParamMethod(int a)
	{
		System.out.println("One Parametrized Method");
		this.Four_ParamMethod(10, 20, 30, 40);
	}
	
	public void Two_ParamMethod(int a, int b)
	{
		System.out.println("Two Parametrized Method");
	}
	
	public void Three_ParamMethod(int a, int b, int c)
	{
		System.out.println("Three Parametrized Method");
		this.Default_method();
	}
	
	public void Four_ParamMethod(int a, int b, int c, int d)
	{
		System.out.println("Four Parametrized Method");
		this.Two_ParamMethod(10, 20);
	}
	
	public static void main(String[] args) {
		Assignment_this manish= new Assignment_this();
		manish.Three_ParamMethod(10, 20, 30);
	}
	
	

}
