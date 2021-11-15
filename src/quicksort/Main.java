package quicksort;

public class Main {

	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end)
		callStart: {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = begin;

		partitionStart:
		for (int j = begin; j < end; j++) {

			checking:
			if (arr[j] <= pivot) {

				swap: {
					int swapTemp = arr[i];
					arr[i] = arr[j];
					arr[j] = swapTemp;
				}
				i++;
			}
		}

		pivotSwap: {
			int swapTemp = arr[i];
			arr[i] = arr[end];
			arr[end] = swapTemp;
		}

		return i;
	}

	public static void main(String[] args) {
		// quickSort(new int[]{5,2,3,1,4}, 0, 4);
		quickSort(new int[]{5,4,3,2,1}, 0, 4);
	}
}
