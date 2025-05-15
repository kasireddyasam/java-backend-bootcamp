package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] arr = {1,2,3,4,5,6,7};
        for(int i:arr) System.out.printf("%d ",i);


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        double average = Arrays.stream(arr).average().orElse(0);
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        int sum = Arrays.stream(arr).sum();

        System.out.printf("Sum: %d, Average: %.2f, Max: %d, Min: %d%n", sum, average, max, min);


    }
}
