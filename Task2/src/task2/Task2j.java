package task2;

import java.util.Scanner;

public class Task2j {

	public static void main(String[] args) {
		// initialize the array of 3*3 order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension-1 for the matrix");
		int x = sc.nextInt();
		System.out.println("Enter the dimension-2 for the matrix");
		int y = sc.nextInt();
        int[][] arr = new int[x][y];
  
        System.out.println("enter the elements of matrix");
  
        int k = 1;
  
        // get the elements from user
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
  
        System.out.println("Matrix before Transpose ");
  
        // display original matrix
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
  
        System.out.println("Matrix After Transpose ");
  
        // transpose and print matrix
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" " + arr[j][i]);
            }
            System.out.println();
        }
	}

}
