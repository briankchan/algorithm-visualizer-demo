package gcd;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int a1 = 105;
		int b1 = 252;
		int a2 = 42;
		int b2 = 22*11;
		main: {
			part1(105, 252);
			part2(42, 21*11);
		}
	}

	private static int part1(int a, int b) {
		int originalA = a;
		int originalB = b;
		start:
		while (a != b)
		loop: {
			int c = b-a;

			check:
			if (c < a)
			updateLeft: {
				b = a;
				a = c;
			} else
			updateRight: {
				b = c;
			}
		}
		int output = a;
		end:
		return output;
	}

	private static int part2(int a, int b) {
		int originalA = a;
		int originalB = b;
		start:
		while (a != b)
		loop: {
			int c = b % a;

			check: {
				if (c == 0) {
					break;
				}

				// gross code to add an extra pause
				if (b == originalB)
				pauseForMod: {
					noop();
				}
			}

			updateLeft: {
				b = a;
				a = c;
			}
		}
		int output = a;
		end:
		return output;
	}

	private static void noop() {}
}
