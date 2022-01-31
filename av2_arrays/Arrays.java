package av2_arrays;

/**
 * Main
 */
public class Arrays {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 5, 18, -16, 0};

		loop:
		for (int i = 0; i < numbers.length; i++) {
			increment: numbers[i] += 1;
		}
	}
}
