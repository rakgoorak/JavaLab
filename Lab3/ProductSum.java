package org.example;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productSum = 0;

        while (true) {
            int product = sc.nextInt();
            if (product <= -1) {
                break;
            }

            productSum += product;
        }

        System.out.println(productSum);

    }
}