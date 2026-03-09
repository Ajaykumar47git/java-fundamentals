package com.java.fundamentals;

import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    System.out.println("Enter Product ID:");
    int ProductID = Scanner.nextInt();

    System.out.println("Enter Product Category Code : ");
    char CategoryCode = Scanner.next().charAt(0);

    System.out.println("Enter the Quantity Available :");
    short QuantityAcailable = Scanner.nextShort();

    System.out.println("Enter the Unit Price :");
    double UnitPrice = Scanner.nextDouble();

    System.out.println("Enter the Discount Percentage :");
    float DiscountPercentage = Scanner.nextFloat();

    System.out.println("Enter the Supplier Contact :");
    long SupplierContact = Scanner.nextLong();

    System.out.println("Enter whether the Product is Avilable or not  :");
    boolean ProductAvalable = Scanner.nextBoolean();

    System.out.println("Enter the Product rating : ");
    byte Rating = Scanner.nextByte();

Scanner.close();
    System.out.println("Product ID:" + ProductID);
    System.out.println("Product Category Code :" +CategoryCode);
    System.out.println("Quantity Available :"+QuantityAcailable);
    System.out.println("Unit Price :"+UnitPrice);
    System.out.println("Discount Percentage :"+DiscountPercentage);
    System.out.println("Supplier Contact :"+SupplierContact);
    System.out.println("whether the Product is Avilable or not  :"+ProductAvalable);
    System.out.println("Product rating : " + Rating);
}
}
