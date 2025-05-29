package com.data;
import java.util.Scanner;

public class Bai3 {
    // Đảo ngược mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        while (true) {
            int number = Integer.parseInt(sc.nextLine());
            if(number> 0) {
                int[] arr = new int[number];
                int[] reverseArr = new int[number];
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ" + (i+1) + ": ");
                    arr[i] = sc.nextInt();
                }
                for (int i = 0; i < arr.length ; i ++) {
                    reverseArr[i] = arr[arr.length - 1 - i];
                }
                //     [11,22,33,4,15,12]
                //index [0 ,1 ,2 ,3,4 ,5]
                System.out.println("Mảng sau khi đảo ngược là: ");
                for (int item : reverseArr) {
                    System.out.printf( + item + " ");
                }
                break;
            }
            else {
                System.out.println("Nhập vào số lượng phần tử trong mảng: ");
            }
        }
    }
}
