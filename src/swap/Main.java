package swap;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		before:
		for (int i=0; i<arr.length-1; i++)
		swap: {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
}
