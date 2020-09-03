package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Ascending order, greater value at the end
        // O(n^2) time complexity - Quadratic

        System.out.print("Unsorted array before insertion sort: ");
        for (int i : intArray) System.out.print(i + " ");

        // firstUnsortedIndex = 1 because we assume index 0 is already sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            // position where we hold the element to be added
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        System.out.print("\nSorted array after insertion sort: ");
        for (int i : intArray) System.out.print(i + " ");
    }
}
