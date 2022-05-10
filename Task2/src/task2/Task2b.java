package task2;

import java.util.Scanner;

public class Task2b {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You want to find the fibonacci series upto how many places?");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Series is:");
		System.out.println(a);
		System.out.println(b);
		
		for(int i =1; i<=n-2; i++)
		{
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
