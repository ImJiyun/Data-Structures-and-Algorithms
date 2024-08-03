public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // outer loop: increase the sorted partition by one
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIdx = 0;
            // inner loop: look for the largest element
            for (int i = 1; i <= lastUnsortedIndex; i++) { // didn't need the equals in bubble sort, but here I wanna compare every element
                // whatever largest
                if (intArray[i] > intArray[largestIdx]) {
                    largestIdx = i;
                }
            }
            // swap the largest element and the last unsorted index
            swap(intArray, largestIdx, lastUnsortedIndex);
        }

        // print the sorted elements
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        // do nothing if i = j
        if (i == j) {
            return;
        }
        // swap array[i] and array[j]
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
