package com.data;
import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    // In ra số lẻ lớn nhất và nhỏ nhất trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        while (true) {
            int number = Integer.parseInt(sc.nextLine());
            if(number> 0) {
                int[] arr = new int[number];
                int oddCount = 0;
                for (int i = 0; i < number; i++) {
                    System.out.println("Nhập vào phần tử thứ" + (i+1) + ": ");
                    arr[i] = sc.nextInt();
                    if(arr[i] % 2 != 0) {
                        oddCount +=1;
                    }
                }
                if(oddCount > 0) {
                    int[] oddArr = new int[oddCount];
                    int index = 0;
                    for(int i = 0; i < arr.length; i ++){
                        if(arr[i] % 2 != 0) {
                            oddArr[index++] = arr[i];
                        }
                    }
                    System.out.println("Mảng các số lẻ: " );
                    for(int item : oddArr) {
                        System.out.printf(item + " ");
                    }
                    System.out.println(" ");
                    int oddMaxNumber = Calculate.findMax(oddArr);
                    int oddMinNumber = Calculate.findMin(oddArr);
                    System.out.println("Số lẻ lớn trong mảng là: " + oddMaxNumber);
                    System.out.println("Số lẻ nhỏ trong mảng là: " + oddMinNumber);
                }
                else {
                    System.out.println("Không có số lẻ trong mảng");
                }
//                int[] oddArr2 = Arrays.stream(arr).filter(item -> item %2 !=0).toArray();
//                int oddMaxNumber2 = Calculate.findMax(oddArr2);
//                int oddMinNumber2 = Calculate.findMin(oddArr2);
//                System.out.println("Số lẻ lớn trong mảng là: " + oddMaxNumber2);
//                System.out.println("Số lẻ nhỏ trong mảng là: " + oddMinNumber2);
                break;
            }
            else {
                System.out.println("Nhập vào số lượng phần tử trong mảng: ");
            }
        }
    }
}
