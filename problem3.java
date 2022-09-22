package problemsInJava;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input value");
		x=sc.nextInt();
		if(x%2==0) {
			x--;
			}
			int c=1;
			for(int i=1;i<=x;i++ )
				{
					System.out.println(c);
					c=c+2;
					
		
			}
		

	}

}
