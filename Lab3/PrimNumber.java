package org.example;

import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (true) {
            if (n <= i) break;
            if ((n % i) == 0) break;
            i++;
        }
        if ((n <= i)&&((n % i) == 0)) {
            System.out.println("เป็นจำนวนเฉพาะ");
        }else {
            System.out.println("ไม่เป็นจำนวนเฉพาะ");
        }
    }
}
