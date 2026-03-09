package com.java.fundamentals;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID of the Employee: ");
        int EmployeeID = Scanner.nextByte();

        System.out.println("Enter Age of the Employee:");
        byte Age = Scanner.nextByte();

        System.out.println("Enter Department Code of the Employee:");
        char DepartmentCode = Scanner.next().charAt(0);

        System.out.println("Enter Monthly Salary of the Employee:");
        double MonthlySalary = Scanner.nextDouble();

        System.out.println("Enter Years of Experience of the Employee:");
        short YearsOfExperience = Scanner.nextShort();

        System.out.println("Enter Mobile Number of the Employee:");
        long MobileNumber = Scanner.nextLong();

        System.out.println("Enter whether the employee is Permanent or not:");
        boolean IsPermanentEmployee = Scanner.nextBoolean();

        System.out.println("Enter Performance Rating of the Employee:");
        float PerformanceRating = Scanner.nextFloat();

        Scanner.close();

        System.out.println("EmployeeID : "+EmployeeID);
        System.out.println("Age : "+Age);
        System.out.println("Department Code : " +DepartmentCode );
        System.out.println("Monthly Salary : " + MonthlySalary);
        System.out.println("Years of Experience : " + YearsOfExperience);
        System.out.println("Mobile Number : " + MobileNumber);
        System.out.println("whether the employee is Permanent or not :" + IsPermanentEmployee);
        System.out.println("Performance Rating : " + PerformanceRating);
    }
}
