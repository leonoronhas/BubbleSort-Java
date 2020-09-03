package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Divide and conquer
        // O(nlogn) time complexity

        System.out.print("Unsorted array before merge sort: ");
        for (int i : intArray) System.out.print(i + " ");

        mergeSort(intArray, 0, intArray.length);

        System.out.print("\nSorted array after merge sort: ");
        for (int i : intArray) System.out.print(i + " ");
    }

    // Function that will divide and conquer the array into left and right partitions
    public static void mergeSort(int[] array, int start, int end) {

        // Break the recursion
        // for 1 element array
        if (end - start < 2) {
            return;
        }

        // Partition array in half until 1 element arrays
        int mid = (start + end) / 2;

        // Handle left partition first
        mergeSort(array, start, mid);
        // Handle right partition last
        mergeSort(array, mid, end);

        // Merge sorted arrays
        merge(array, start, mid, end);
    }

    // Function to merge 1 element arrays
    public static void merge(int[] array, int start, int mid, int end) {

         /* Check for already sorted partitions
         If the last element in the left partition is
         smaller than the first element in the right partition
         no need to merge. Array is already sorted */
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        // Put them together, merge them
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }
}
