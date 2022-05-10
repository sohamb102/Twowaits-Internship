package task2;

import java.util.Scanner;

public class Factorial {
	
	int n;

	public int cal_fact()
	{
		int fact = 1;
		
		while(n!=0)
		{
			fact = fact * (n);
			n = n-1;
			//if(n==0)
			//	break;
		}
		
		return fact;
	}
}
