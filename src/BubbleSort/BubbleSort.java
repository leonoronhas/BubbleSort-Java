package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Ascending order, greater value at the end
        // O(n^2) time complexity - Quadratic
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // Run it again but now up to the unsorted index
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        // Print values
        System.out.print("Sorted array after bubble sort: ");
        for (int i = 0; i < intArray.length; i++) System.out.print(intArray[i] + " ");
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
