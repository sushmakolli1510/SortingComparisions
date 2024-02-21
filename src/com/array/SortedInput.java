package com.array;

import java.lang.*;
import java.util.*;

public class SortedInput {
    private static final int RANGE_OF_NUMBERS = 5000;
    public static void main(String[] args) {
        // Scanner to get input length from user
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number of elements to be sorted :");
        int N = in.nextInt();
        in.close();
        //Generating Sorted Input
        int sortedArr[] = generateRandomArray(N);
        Arrays.sort(sortedArr);

        int sortedArr1[] = Arrays.copyOf(sortedArr, sortedArr.length);
        int sortedArr2[] = Arrays.copyOf(sortedArr, sortedArr.length);
        int sortedArr3[] = Arrays.copyOf(sortedArr, sortedArr.length);
        int sortedArr4[] = Arrays.copyOf(sortedArr, sortedArr.length);

        //Time taken for Insertion sort for the reverse sorting input
        System.out.println("* INSERTION SORT *");
        //System.out.println("Original sorted Array as input: " + Arrays.toString(sortedArr));
        long startTime = System.nanoTime();
        SortingTechniques.insertionSort(sortedArr);
        long endTime = System.nanoTime();
        //System.out.println("Output after Sorting: " + Arrays.toString(sortedArr));
        System.out.println("Total Execution time of insertion sort in nanoseconds: " + (endTime - startTime));

        //Time taken for Merge sort for the reverse sorting input
        System.out.println("* MERGE SORT *");
        //System.out.println("Original sorted Array as input: " + Arrays.toString(sortedArr1));
        long startTime1 = System.nanoTime();
        SortingTechniques.mergeSort(sortedArr1, 0, sortedArr1.length - 1);
        long endTime1 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(sortedArr1));
        System.out.println("Total Execution time of merge sort in nanoseconds: " + (endTime1 - startTime1));

        //Time taken for heapSort for the reverse sorting input
        System.out.println("* HEAP SORT *");
        //System.out.println("Original sorted Array as input: " + Arrays.toString(sortedArr2));
        long startTime2 = System.nanoTime();
        SortingTechniques.heapSort(sortedArr2);
        long endTime2 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(sortedArr2));
        System.out.println("Execution time in nanoseconds: " + (endTime2 - startTime2));

        //Time taken for inplace quickSort for the reverse sorting input
        System.out.println("* IN PLACE QUICK SORT *");
        //System.out.println("Original sorted Array: " + Arrays.toString(sortedArr3));
        long startTime3 = System.nanoTime();
        SortingTechniques.inPlaceQuickSort(0,sortedArr3.length-1,sortedArr3);
        long endTime3 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(sortedArr3));
        System.out.println("Execution time in nanoseconds: " + (endTime3 - startTime3));

        //Time taken for Modified quickSort Using median for the reverse sorting input
        System.out.println("* MODIFIED QUICK SORT *");
        //System.out.println("Original sorted Array: " + Arrays.toString(sortedArr4));
        long startTime4 = System.nanoTime();
        SortingTechniques.modifiedQuickSort(sortedArr4,0,sortedArr4.length-1);
        long endTime4 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(sortedArr4));
        System.out.println("Execution time in nanoseconds: " + (endTime4 - startTime4));
    }


//method to generate random array
    public static int[] generateRandomArray(int n) {
        int[] randomarray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomarray[i] = random.nextInt(n);
        }
        return randomarray;
    }
}
