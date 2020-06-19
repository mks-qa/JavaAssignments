package Practice1;

public class this_super extends this_parent {

	public this_super()
	{
		super();
		System.out.println("Child Default Constructor");
	}
	
	public this_super(int a)
	{
		this(10,10,10);
		System.out.println("Child One Param Constructor");
	}
	
	public this_super(int a, int b)
	{
		this(10);
		System.out.println("Child Two Param Constructor");
	}
	
	public this_super(int a, int b, int c)
	{
		this();
		System.out.println("Child Three Param Constructor");
	}
	
	public static void main(String[] args) {
		this_super m= new this_super(10,10);
		
	}
}
