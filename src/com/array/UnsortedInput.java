package com.array;
//package com.array.SortingTechniques;

import java.util.*;
import java.lang.*;


public class UnsortedInput {

    private static final int RANGE_OF_NUMBERS = 5000;
    //private static final Random random = new Random();1
    public static void main(String[] args) {

        // Scanner to get input length from user
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number of elements to be sorted :");
        int N = in.nextInt();
        in.close();

        // Initialize the arrays with random numbers
        int arr[] = generateRandomArray(N);
        int arr1[] = Arrays.copyOf(arr, arr.length);
        int arr2[] = Arrays.copyOf(arr, arr.length);
        int arr3[] = Arrays.copyOf(arr, arr.length);
        int arr4[] = Arrays.copyOf(arr, arr.length);

        //Time taken for Insertion sort for the given input
        System.out.println("* INSERTION SORT *");
        //System.out.println("Original Array: " + Arrays.toString(arr));
        long startTime = System.nanoTime();
        SortingTechniques.insertionSort(arr);
        long endTime = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Execution time in nanoseconds: " + (endTime - startTime));

        //Time taken for Merge sort for given input
        System.out.println("* MERGE SORT *");
        //System.out.println("Original Array: " + Arrays.toString(arr1));
        long startTime1 = System.nanoTime();
        SortingTechniques.mergeSort(arr1, 0, arr1.length - 1);
        long endTime1 = System.nanoTime();
      // System.out.println("Sorted Array: " + Arrays.toString(arr1));
        System.out.println("Execution time in nanoseconds: " + (endTime1 - startTime1));

        //Time taken for heapSort for given input
        System.out.println("* HEAP SORT *");
       // System.out.println("Original Array: " + Arrays.toString(arr2));
        long startTime2 = System.nanoTime();
        SortingTechniques.heapSort(arr2);
        long endTime2 = System.nanoTime();
       // System.out.println("Sorted Array: " + Arrays.toString(arr2));
        System.out.println("Execution time in nanoseconds: " + (endTime2 - startTime2));

        //Time taken for inplace quickSort for given input
        System.out.println("* IN PLACE QUICK SORT *");
        //System.out.println("Original Array: " + Arrays.toString(arr3));
        long startTime3 = System.nanoTime();
        SortingTechniques.inPlaceQuickSort(0,arr3.length-1,arr3);
        long endTime3 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(arr3));
        System.out.println("Execution time in nanoseconds: " + (endTime3 - startTime3));

        //Time taken for Modified quickSort Using median for given input
        System.out.println("* MODIFIED QUICK SORT *");
        //System.out.println("Original Array: " + Arrays.toString(arr4));
        long startTime4 = System.nanoTime();
        SortingTechniques.modifiedQuickSort(arr4,0,arr4.length-01);
        long endTime4 = System.nanoTime();
        //System.out.println("Sorted Array: " + Arrays.toString(arr4));
        System.out.println("Execution time in nanoseconds: " + (endTime4 - startTime4));
    }


//To generate random array
    public static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }





}
