package com.code;

import java.util.Scanner;

public class SearchGreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, a = ");
        int a = scanner.nextInt();
        System.out.println("Enter a number, b = ");
        int b = scanner.nextInt();
        while (a != b){
            if (a > b){
                a = a -b;
            }else {
                b = b-a;
            }
        }
        System.out.println("Greatest Common Factor of (a,b) = " + a);
    }
}
