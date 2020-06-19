package Practice1;

public class this_parent {
	
	public this_parent()
	{
		this(10,20);
		System.out.println("Parent Default Constructor");
	}
	
	public this_parent(int a)
	{
		this(10,20,30);
		System.out.println("Parent One Param Constructor");
	}
	
	public this_parent(int a, int b)
	{
		this(10);
		System.out.println("Parent Two Param Constructor");
	}
	
	public this_parent(int a, int b, int c)
	{
		System.out.println("Parent Three Param Constructor");
	}

}
