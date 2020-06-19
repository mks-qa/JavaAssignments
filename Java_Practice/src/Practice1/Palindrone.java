package Practice1;

import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {
		{
			int num, rem, orig, rev=0;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter your no: ");
			num= scan.nextInt();
			
			orig=num;
			
			while(num >0)
			{
				rem= num%10;
				rev= rev*10 + rem;
				num= num/10;
				
			}
			
			if(rev==orig)
			{
				System.out.println("This is a Palindrone Number");
			}
			
			else
			{
				System.out.println("This is not a Palindrone Number");
			}
		}
	}

}
