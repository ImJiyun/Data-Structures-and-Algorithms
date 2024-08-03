public class SelectionSort2 {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIdx = 0; firstUnsortedIdx < intArray.length - 1; firstUnsortedIdx++) {

            int smallestIdx = firstUnsortedIdx;

            for (int i = firstUnsortedIdx + 1; i < intArray.length; i++) {
                if (intArray[i] < intArray[smallestIdx]) {
                    smallestIdx = i;
                }
            }
            swap(intArray, smallestIdx, firstUnsortedIdx);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
