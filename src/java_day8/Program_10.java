package java_day8;

import java.util.Scanner;

public class Program_10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		
		System.out.println(" Value need to enter : ");
		
		int numbers = scanner.nextInt();
		
		String scanner1 = Integer.toString(numbers);
		
		int  numberofvalues = scanner1.length();
		
		System.out.println("The total number of Integers : "+ numberofvalues);
		
	}

}
