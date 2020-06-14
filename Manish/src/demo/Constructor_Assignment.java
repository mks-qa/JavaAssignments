package demo;

public class Constructor_Assignment {

	public Constructor_Assignment()
	{
		this(10,20,30);
		System.out.println("Default Parametrized Constructor");
	}
	
	public Constructor_Assignment(int a)
	{
		this();
		System.out.println("One Parametrized Constructor");
	}
	
	public Constructor_Assignment(int a, int b)
	{
		this(10);
		System.out.println("Two Parametrized Constructor");
	}
	
	public Constructor_Assignment(int a, int b, int c)
	{
		System.out.println("Three Parametrized Constructor");
	}
	
	public static void main(String[] args) {
		Constructor_Assignment manish= new Constructor_Assignment(10,20);
		
	}
}
