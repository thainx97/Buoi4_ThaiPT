package com.data;

import java.util.Scanner;

public class Bai6 {
    // Sắp xếp mảng để chẵn đứng trước và lẻ đứng sau sao cho không thay đổi thứ tự
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int number = sc.nextInt();
        while (true) {
            if(number > 0) {
                int oddCount = 0;
                int evenCount = 0;
                int[] arr = new int[number];
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ " + (i+1) + ": ");
                    arr[i] = sc.nextInt();
                    if (arr[i] % 2 ==0){
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                int[] evenArr = new int[evenCount];
                int[] oddArr = new int[oddCount];
                int[] arrangedArr = new int[arr.length];
                int idxEvenArr = 0;
                int idxOddArr = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        evenArr[idxEvenArr++] = arr[i];
                    } else {
                        oddArr[idxOddArr++] = arr[i];
                    }
                }
                for (int j = 0; j < evenArr.length; j++) {
                    arrangedArr[j] = evenArr[j];
                }
                for (int k = 0; k < oddArr.length; k++) {
                    arrangedArr[k + evenCount] = oddArr[k];
                }
                System.out.println("Mảng sau khi sắp xếp là: ");
                for (int item : arrangedArr) {
                    System.out.printf(item + " ");
                }
                break;
            } else {
                System.out.println("Nhập vào độ dài mảng: ");
            }
        }
    }
}
