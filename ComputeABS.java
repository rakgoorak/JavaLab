package org.example;

import java.util.Scanner;

public class ComputeABS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a - b;
        int y;
        if (x < 0) {
            y = -x;
        } else {
            y = x;
        }
        System.out.println("ค่าสมบูรณ์ = " + y);
    }
}
