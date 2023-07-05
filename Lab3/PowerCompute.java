package org.example;

import java.util.Scanner;

public class PowerCompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        int y = 1;
        for (int i = 1; i <= a; i++) {
            x *= 5;
        }
        for (int i = 1; i <= b; i++) {
            y *= 3;
        }
        int sum = x + y;
        System.out.println(sum);
    }
}
