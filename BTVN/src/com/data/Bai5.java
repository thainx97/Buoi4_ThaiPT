package com.data;

import java.util.Scanner;

public class Bai5 {
    // Tìm số xuất hiện nhiều nhất trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        int number = sc.nextInt();
        while (true) {
            if(number > 0) {
                int[] arr = new int[number];
                Boolean isAllEqual = true;
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ " + (i+1) + ": ");
                    arr[i] = sc.nextInt();
                }
                int countMax = 0;
                int mostRepeated = arr[0];
                int[] counts = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    int count = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if(arr[j] == arr[i]) {
                            count++;
                        }
                    }
                    counts[i] = count;
                    if(count > countMax) {
                        countMax = count;
                        mostRepeated = arr[i];
                    }
                }
                for(int i = 1; i < counts.length; i++) {
                    if(counts[i] != counts[0]) {
                        isAllEqual = false;
                    }
                }
                if(isAllEqual) {
                    System.out.println("Các phần tử xuất hiện số lần như nhau là " + counts[0]);
                } else {
                    System.out.println("Phần tử xuất hiện nhiều nhất là " + mostRepeated + " với " +  countMax + " lần");
                }
                break;
            } else {
                System.out.println("Nhập vào độ dài mảng: ");
            }
        }
    }
}
