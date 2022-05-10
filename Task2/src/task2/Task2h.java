package task2;

import java.util.ArrayList;

public class Task2h {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(0);
		arr.add(1);
		boolean flag = true;
		int i = 0;
		
		for(Object x: arr)
		{
			
			int a = (int) x;
			int b = arr.get(a);
			if(i!=b)
			{
				flag = false;
				System.out.println("The array is not Mirror Inverse");
				break;
			}
			i = i + 1;
		}
		
		if(i==arr.size())
			System.out.println("The array is Mirror Inverse");
		
	}

}
