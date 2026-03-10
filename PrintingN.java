package com.java.fundamentals;

import java.util.Scanner;

public class PrintingN {
    public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);

            System.out.print("Enter a n value: ");
            int n = Scanner.nextInt();

            for (int i = 1;i < n;i++) {
                System.out.println(i);
            }

            Scanner.close();
        }
    }

