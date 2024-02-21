package com.array;

import java.util.*;
import java.lang.*;

public class ReverseSortedInput {
    private static final int RANGE_OF_NUMBERS = 5000;
    public static void main(String[] args) {
        // Scanner to get input length from user
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number of elements to be sorted :");
        int N = in.nextInt();
        in.close();

        int arr[] = generateRandomArray(N);

        int[] reversedArray = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        //Arrays.sort(arr, Collections.reverseOrder());
        int reversedArray1[] = Arrays.copyOf(reversedArray, reversedArray.length);
        int reversedArray2[] = Arrays.copyOf(reversedArray, reversedArray.length);
        int reversedArray3[] = Arrays.copyOf(reversedArray, reversedArray.length);
        int reversedArray4[] = Arrays.copyOf(reversedArray, reversedArray.length);

        //Time taken for Insertion sort for the reverse sorting input
        System.out.println("* INSERTION SORT *");
        //System.out.println("Original reverse sorted Array: " + Arrays.toString(reversedArray));
        long startTime = System.nanoTime();
        SortingTechniques.insertionSort(reversedArray);
        long endTime = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(reversedArray));
        System.out.println("Execution time in nanoseconds: " + (endTime - startTime));

        //Time taken for Merge sort for the reverse sorting input
        System.out.println("* MERGE SORT *");
        //System.out.println("Original reverse sorted Array: " + Arrays.toString(reversedArray1));
        long startTime1 = System.nanoTime();
        SortingTechniques.mergeSort(reversedArray1, 0, reversedArray1.length - 1);
        long endTime1 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(reversedArray1));
        System.out.println("Execution time in nanoseconds: " + (endTime1 - startTime1));

        //Time taken for heapSort for the reverse sorting input
        System.out.println("* HEAP SORT *");
        //System.out.println("Original reverse sorted Array: " + Arrays.toString(reversedArray2));
        long startTime2 = System.nanoTime();
        SortingTechniques.heapSort(reversedArray2);
        long endTime2 = System.nanoTime();
       //System.out.println("Sorted Array: " + Arrays.toString(reversedArray2));
        System.out.println("Execution time in nanoseconds: " + (endTime2 - startTime2));

        //Time taken for inplace quickSort for the reverse sorting input
        System.out.println("* IN PLACE QUICK SORT *");
       //System.out.println("Original reverse sorted Array: " + Arrays.toString(reversedArray3));
        long startTime3 = System.nanoTime();
        SortingTechniques.inPlaceQuickSort(0,reversedArray3.length-1,reversedArray3);
        long endTime3 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(reversedArray3));
        System.out.println("Execution time in nanoseconds: " + (endTime3 - startTime3));

        //Time taken for Modified quickSort Using median for the reverse sorting input
        System.out.println("* MODIFIED QUICK SORT *");
        //System.out.println("Original reverse sorted Array: " + Arrays.toString(reversedArray4));
        long startTime4 = System.nanoTime();
        SortingTechniques.modifiedQuickSort(reversedArray4,0,reversedArray4.length-1);
        long endTime4 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(reversedArray4));
        System.out.println("Execution time in nanoseconds: " + (endTime4 - startTime4));
    }
    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }


    }








