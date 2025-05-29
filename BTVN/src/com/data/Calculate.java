package com.data;

public class Calculate {
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int[] bubbleSort(int[] arr) {
        int num = arr.length;
        for(int i = 0; i < num - 1; i++) {
            for(int j = 0; j < num - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("arr" + j + ": " + arr[j]);
                    System.out.println("arr" + (j + 1) + ": " + arr[j+1]);
                }
            }
        }
        return arr;
    }
}
