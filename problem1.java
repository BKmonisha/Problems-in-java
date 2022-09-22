package problemsInJava;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		 double num1, num2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first numbers");
	        num1 = sc.nextDouble();
	        System.out.println("Enter the second numbers");
	        num2 = sc.nextDouble();
	        System.out.println("Enter the operator (+,-,*,/)");
	        char ope = sc.next().charAt(0);
	        double a = 0;
	        switch (ope) {
	        case '+':
	            a = num1 + num2;
	            break;
	        case '-' :
	            a = num1 - num2;
	            break;
	        case '*':
	            a = num1 * num2;
	            break;
	        case '/':
	            a = num1 / num2;
	            break;
	        default:
	            System.out.println("You enter wrong input");
	            break;
	        }
	        System.out.println(num1 + " " + ope + " " + num2 + " = " + a);

	}

}
