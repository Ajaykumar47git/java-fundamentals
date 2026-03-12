package com.java.fundamentals;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner Scanner = new Scanner(System.in);
        int N = Scanner.nextInt();
            if (N % 2  == 0 ){
                System.out.println("The given Number is Even");

        }else
                System.out.println("The given Number is odd ");
    }
}

