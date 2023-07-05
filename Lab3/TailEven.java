package org.example;

import java.util.Scanner;

public class TailEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n % 10;
        if ((i % 2) == 0) {
            System.out.println("เลขเป็นคู่ เลขท้ายเป็น " + i);
        } else {
            System.out.println("เลขเป็นคี่ เลขท้ายเป็น " + i);
        }
    }
}
