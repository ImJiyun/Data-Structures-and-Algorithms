public class BinarySearch {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 7, 18, 40, 55};

        System.out.println(iterativeBinarySearch(intArray, 55));
        System.out.println(iterativeBinarySearch(intArray, 7));
        System.out.println(iterativeBinarySearch(intArray, -44));

        System.out.println("Recursive Binary Search");
        System.out.println(recursiveBinarySearch(intArray, 55));
        System.out.println(recursiveBinarySearch(intArray, 18));
        System.out.println(recursiveBinarySearch(intArray, 3));
    }
    

    public static int iterativeBinarySearch(int[] arr, int key) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        while (startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            // System.out.println("mid Index = " + midIdx);
            if (key == arr[midIdx]) return midIdx;
            else if (key > arr[midIdx]) {
                startIdx = midIdx + 1;
            } else {
                endIdx = midIdx - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int startIdx, int endIdx, int value) {
         if (startIdx > endIdx) return -1;
         int midIdx = (startIdx + endIdx) / 2;
         // System.out.println("mid Index = " + midIdx);
         if (input[midIdx] == value) return midIdx;
         else if (input[midIdx] < value) return recursiveBinarySearch(input, midIdx+1, endIdx, value);
         else return recursiveBinarySearch(input, startIdx, midIdx - 1, value);
    }
}
