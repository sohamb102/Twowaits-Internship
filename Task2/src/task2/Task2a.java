package task2;

import java.util.Scanner;

public class Task2a {

	public static void main(String[] args) {
		int a,b;
		int addop;
		int subop;
		int mulop;
		int divop;
		
		Scanner sc = new Scanner(System.in);
	
				
			System.out.println("Please enter the first number");
			a = sc.nextInt();
			
			System.out.println("Please enter the second number");
			b = sc.nextInt();
			
			String sf1 = String.format("%d + %d = %d", a,b,a+b);
			String sf2 = String.format("%d - %d = %d", a,b,a-b);
			String sf3 = String.format("%d X %d = %d", a,b,a*b);
			String sf4 = String.format("%d / %d = %d", a,b,a/b);
			
			System.out.println(sf1);
			System.out.println(sf2);
			System.out.println(sf3);
			System.out.println(sf4);
			
			

	}

}
