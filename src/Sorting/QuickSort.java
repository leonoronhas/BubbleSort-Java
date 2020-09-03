package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Divide and conquer
        // O(nlogn) time complexity

        System.out.print("Unsorted array before quick sort: ");
        for (int i : intArray) System.out.print(i + " ");

        quickSort(intArray, 0, intArray.length);

        System.out.print("\nSorted array after quick sort: ");
        for (int i : intArray) System.out.print(i + " ");
    }

    public static void quickSort(int[] array, int start, int end) {

        // Check if already a 1 element array
        if (end - start < 2) {
            return;
        }

        // What is the pivot index?
        int pivotIndex = partition(array, start, end);

        // Sort the left partition
        quickSort(array, start, pivotIndex);
        // Sort the right partition
        quickSort(array, pivotIndex + 1, end);
    }

    // Function to return the correct position of the pivot in the sub array
    public static int partition(int[] array, int start, int end) {
        // This is using the first element as the pivot
        int pivot = array[start];

        int i = start; // traverse from left to right
        int j = end;   // traverse from right to left

        while (i < j) {
            // Empty loop
            while (i < j && array[--j] >= pivot) ;
            // Swap places
            if (i < j) {
                array[i] = array[j];
            }

            // Empty loop
            while (i < j && array[++i] <= pivot) ;
            // Swap places
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;

        return j;
    }
}
