package org.example;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double a = (x - 32) / 1.8;
        System.out.println(a);
    }
}
