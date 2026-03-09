package com.java.fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter Roll Number of the Student: ");
        int RollNumber = Scanner.nextByte();

        System.out.println("Enter Age of the Student: ");
        byte Age = Scanner.nextByte();

        System.out.println("Enter Section of the Student: ");
        char Section = Scanner.next().charAt(0);

        System.out.println("Enter Total Marks of the Student:");
        int TotalMarks = Scanner.nextInt();

        System.out.println("Enter Average Marks of the Student");
        float AverageMarks = Scanner.nextFloat();

        System.out.println("Enter Year of Joining of the student ");
        short YearofJoining = Scanner.nextShort();

        System.out.println("Enter Mobile Number of the student ");
        long MobileNumber = Scanner.nextLong();

        System.out.println("Enter whether the Student is Passed or not");
        boolean PassedOrNot = Scanner.hasNextBoolean();
    Scanner.close();
        System.out.println("Student Roll Number : " + RollNumber);
        System.out.println("Student Age : " + Age);
        System.out.println("Student Section : " + Section);
        System.out.println("Student Total Marks : " + TotalMarks);
        System.out.println("Student Average Marks : " + AverageMarks);
        System.out.println("Student Year of Joining : " + YearofJoining);
        System.out.println("Student Mobile Number : " + MobileNumber);
        System.out.println("Passed Status : " + PassedOrNot);
    }
}