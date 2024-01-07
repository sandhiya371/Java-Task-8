package java_day8;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int age = sr.nextInt();

		if (age >= 60) {

			System.out.println("They are Senior Citizens");

		} else {

			System.out.println("They are not Senior Citizens");

		}

	}

}
