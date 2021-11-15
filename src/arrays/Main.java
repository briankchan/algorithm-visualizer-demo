package arrays;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 5, 18, -16, 0};
		create: assert Boolean.TRUE;
		decrease: numbers[0] -= 10;

		incAll: incrementAll(numbers);

		replace: numbers = new int[]{-1, -2};
	}

	private static void incrementAll(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			increment: numbers[i] += 1;
		}
	}
}
