package java_day8;

public class Program_5 {

	public static void main(String[] args) {

		int i = 0;
		int m = 0;
		int flag = 0;
		int n = 11;

		m = n / 2;

		if (n == 0 || n == 1) {

			System.out.println("It is not a prime number");

		} else {

			for (i = 2; i <= m; i++) {

				if (n % i == 0) {

					System.out.println("It is not a prime number");

					flag = 1;

					break;

				}

			}

			if (flag == 0) {

				System.out.println("It is a prime number");

			}
		}

	}

}
