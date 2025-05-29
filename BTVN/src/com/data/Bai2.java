package com.data;
import java.util.Scanner;

public class Bai2 {
    // Đếm số phần tử chẵn
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        while (true) {
            int number = Integer.parseInt(sc.nextLine());
            if(number> 0) {
                int[] arr = new int[number];
                int evenCount = 0;
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ" + (i+1) + ": ");
                    arr[i] = sc.nextInt();
                    if(arr[i] % 2 == 0) {
                        evenCount +=1;
                    }
                }
                System.out.println("Tổng số chẵn trong mảng là: " + evenCount);
                break;
            }
            else {
                System.out.println("Nhập vào số lượng phần tử trong mảng: ");
            }
        }
    }
}
