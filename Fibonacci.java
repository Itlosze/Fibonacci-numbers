import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Integer number = 1;
		System.out.println("--- Fibonacci numbers ---");
		System.out.println("Enter a number: ");
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				number = scanner.nextInt();
				System.out.println("Number "+number+": "+ fibonacciNumber(number));
			} catch (InputMismatchException e) {
				System.out.println("Is not a number");
			}
		}
	}

	public static Integer fibonacciNumber(Integer number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1) {
			return 1;
		} else {
			return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
		}
	}

}
