package task2;

import java.util.Scanner;

public class Task2c {

	public static void main(String[] args) {
		int fact = 1;
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=0)
		{
			fact = fact * (n);
			n = n-1;
			//if(n==0)
			//	break;
		}
		
		System.out.println(fact);

	}

}
