package task2;

import java.util.Scanner;

public class Task2g {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String t = "";
		
		int l = s.length();
		for(int i=0; i<l; i++)
		{
			char temp = s.charAt(i);
			t = temp + t;
		}
		
		System.out.println(t);

	}

}
