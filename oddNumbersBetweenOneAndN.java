package com.java.fundamentals;

import java.util.Scanner;

public class oddNumbersBetweenOneAndN {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = Scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
        }
            System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
            Scanner.close();
    }}}


