package task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2i {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("5");
		arr.add("10");
		arr.add("7");
		arr.add("16");
		arr.add("24");
		
		String s = arr.toString();
		String sf1 = String.format("Original Array:- %s", s);
		System.out.println(sf1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose one option");
		System.out.println("1.Remove by element");
		System.out.println("2.Remove by index");
		int n = sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the element you want to remove");
			int ele = sc.nextInt();
			String ele1 = Integer.toString(ele);
			if(arr.contains(ele1))
			{
				arr.remove(ele1);
				String s1 = arr.toString();
				String sf2 = String.format("Modified Array:- %s", s1);
				System.out.println(sf2);
			}
			else
				System.out.println("The element entered is not present in array");
			
		}
		
		else if(n==2)
		{
			System.out.println("Enter the index of element which you want to remove");
			int ele = sc.nextInt();
			//String ele1 = Integer.toString(ele);
			if(ele < arr.size())
			{
				String temp = arr.get(ele);
				arr.remove(temp);
				String s1 = arr.toString();
				String sf2 = String.format("Modified Array:- %s", s1);
				System.out.println(sf2);
			}
			else
				System.out.println("The element is not present in array");
		}
		
	}

}
