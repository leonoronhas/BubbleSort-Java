package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Ascending order, greater value at the end
        // O(n^2) time complexity - Quadratic

        System.out.print("Unsorted array before selection sort: ");
        for (int i : intArray) System.out.print(i + " ");

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestNumber = 0;

            // Run it again but now up to the unsorted index
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestNumber]) {
                    largestNumber = i;
                }
            }
            // After we know the index of largestNumber, swap it with the last index
            swap(intArray, largestNumber, lastUnsortedIndex);
        }

        // Print values
        System.out.print("\nSorted array after selection sort: ");
        for (int j : intArray) System.out.print(j + " ");
    }

    // Swap function that will take an array and swap i with j in their positions
    public static void swap(int[] array, int i, int j) {

        // check if they are the same
        if (i == j)
            return;

        // swap items
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
