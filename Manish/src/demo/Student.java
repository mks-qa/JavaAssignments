package demo;

public class Student {

	
	int age;
	int roll_no;
	
	public void method1()
	{
		System.out.println("This is method 1 output");
		}
	
	public void method2()
	{
		System.out.println("This is method 2 output");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Deepak= new Student();
		Deepak.age=26;
		System.out.println("Age of student is :"+Deepak.age);
		Deepak.roll_no=10;
		System.out.println("Roll no of student is :"+Deepak.roll_no);
		Deepak.method1();
		Deepak.method2();
		

	}

}
