import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] intArray = {20, 30, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch2(intArray, -22));

        int[] sortedArray = {-22, -15, 1, 7, 20, 30, 55};
        System.out.println(linearSearch3(sortedArray, -15));
        System.out.println(linearSearch4(sortedArray, -15));

    }

    // use for loop
    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // use while loop
    public static int linearSearch2(int[] input, int value) {
        int index = 0;
        // traverse the array until index is equal to the length
        while (index < input.length) {
            if (input[index] == value) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // use for loop
    public static int linearSearch3(int[] input, int value) {
        // if value is bigger than the item at index i, stop comparing
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) return i;
            else if (input[i] > value) return -1;
        }
        return -1;
    }

    // use while loop
    public static int linearSearch4(int[] input, int value) {
        // if value is bigger than the item at index i, stop comparing
        int index = 0;
        // traverse the array until index is equal to the length
        while (index < input.length) {
            if (input[index] == value) return index;
            else if (input[index] > value) return -1;
            index++;
        }
        return -1;
    }
}