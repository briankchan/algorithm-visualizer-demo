package av0_subarraysum;

public class SubarraySum {

	/**
	 * @param arr must be an array of non-negative integers
	 */
	public static int[] findSubarraySum(int arr[], int target) {
		start: noop();
		int last = 1;
		int first = 0;
		int currSum = arr[first];

		String prevOp = "";

		loop:
		while (true)
		loopBody: {
			int iterationFirst = first;
			int iterationLast = last;

			checks:
			if (currSum == target)
			found: {
				return new int[]{first, last};
			} else
			if (currSum > target)
			tooBig: {
				currSum -= arr[first];
				first++;
				prevOp = "tooBig";
			} else
			tooSmall: {
				if (last >= arr.length) {
					return null;
				}
				currSum += arr[last];
				last++;
				prevOp = "tooSmall";
			}
		}
	}

	public static void noop() {}

	public static void main(String[] args) {
		findSubarraySum(new int[]{6,8,3,9,6,1,2}, 16);
	}
}
