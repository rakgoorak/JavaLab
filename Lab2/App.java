package org.example;

import java.nio.CharBuffer;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 5 == 0) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
