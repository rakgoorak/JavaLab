package org.example;

import java.util.Scanner;

public class BetweenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 10 && a <= 100) {
            System.out.println("ค่าอยู่ระหว่าง 10 ถึง 100");
        }else {
            System.out.println("อยู่นอกเงือนไข");
        }
    }
}
