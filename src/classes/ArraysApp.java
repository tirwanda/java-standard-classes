package classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 2, 23, 2, 5,};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 6));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));
    }
}
