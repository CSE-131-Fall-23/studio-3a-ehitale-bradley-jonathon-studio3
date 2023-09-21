package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n = in.nextInt();
		// int[] array1 = new int[n];
		boolean[] boolArr = new boolean[n+1]; 
		String str = "";
		
		for(int number = 2; number <= n; number++) {
			 if (!boolArr[number]) {
				 for (int p = number; p <= n; p+=number) {
					 boolArr[p] = true;
				 }
				 str += number + " ";
			 }
			 
		}
		
		System.out.println(str);

		
	}

}
