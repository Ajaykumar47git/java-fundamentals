package com.java.fundamentals;

import java.util.Scanner;

public class OddNumbersTillN {
    public static void main(String[] args) {
        System.out.println("Enter  n value");
        Scanner Scanner = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
