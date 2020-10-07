package assignments5;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		// Write a program to print Fibonacci series of n terms where n is declared by user : 
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		Scanner scan= new Scanner(System.in);
		
		int n1=0;
		int n2=1;
	
		
		System.out.println("Enter number");
		int n3= scan.nextInt();

        for (; n3 >= 1; n3--)
        {
            System.out.print(n1 + " , ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
			
        }
	}

}
