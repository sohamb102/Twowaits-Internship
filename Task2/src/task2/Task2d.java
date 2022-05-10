package task2;

import java.util.Scanner;

public class Task2d {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int l = s.length();
		int t = l /2;
		
		boolean flag = true;
		
		int i = 0;
		int j = l-1;
		
		while(i<t)
		{
			char s1 = s.charAt(i);
			char s2 = s.charAt(j);
			i = i +1;
			j = j -1;
			if(s1!=s2)
			{
				flag = false;
				System.out.println("String is not a palindrome");
				break;
			}
		}
		
		if(i==t)
			System.out.println("String is a palindrome");
	}

}
