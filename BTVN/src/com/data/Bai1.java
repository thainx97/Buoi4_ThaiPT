package com.data;
import java.util.Scanner;

public class Bai1 {
    // Tính tổng các phần tử trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        while (true) {
            int number = Integer.parseInt(sc.nextLine());
            int total = 0;
            if(number> 0) {
                int[] arr = new int[number];
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ: ");
                    arr[i] = sc.nextInt();
                    total = total + arr[i];
                }
                System.out.println("Tổng các phần tử trong mảng là: " + total);
                break;
            }
            else {
                System.out.println("Nhập vào số lượng phần tử trong mảng: ");
            }
        }
    }
}
