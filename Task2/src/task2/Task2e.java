package task2;

import java.util.Scanner;

public class Task2e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int ns = sc.nextInt();
		System.out.println("Enter value of r");
		int rs = sc.nextInt();
		
		Factorial f1 = new Factorial();
		f1.n = ns;
		int fact_n = f1.cal_fact();
		
		Factorial f2 = new Factorial();
		f2.n = rs;
		int fact_r = f2.cal_fact();
		
		Factorial f3 = new Factorial();
		f3.n = ns - rs;
		int fact_nr = f3.cal_fact();
		
		int perm = fact_n / fact_nr;
		String sf1 = String.format("Permutation = %d", perm);
		System.out.println(sf1);
		
		int comb = fact_n / (fact_r * fact_nr);
		String sf2 = String.format("Combination = %d", comb);
		System.out.println(sf2);
		
		

	}

}
