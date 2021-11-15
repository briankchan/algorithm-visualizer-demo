package linearSearch;

public class Main {
	public static void main(String[] args) {
		linearSearch(new int[]{5, 12, 100}, 7);
	}

	private static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			check:
			if (arr[i] == target) {
				found:
				return i;
			}
		}
		notfound:
		return -1;
	}
}
