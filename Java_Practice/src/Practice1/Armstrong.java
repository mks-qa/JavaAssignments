package Practice1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		{
			int n,nu, num=0, rem;
			
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Please enter your no: ");			
			n=scan.nextInt();
			
			nu=n;
			
			while(nu!=0)
			{
				rem=nu%10;
				num=num+ rem*rem*rem;
				nu= nu/10;
								
			}
			
			if(num==n)
			{
				System.out.println("This is an Armstrong no");
			}
			
			else
			{
				System.out.println("This is not a Armstrong no");
			}
		}
	}
}
