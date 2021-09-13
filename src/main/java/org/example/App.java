package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter the price of item 1: ");
        Scanner sc = new Scanner(System.in);
        int price_1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the quantity of item 1: ");
        int quantity_1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the price of item 2: ");
        int price_2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the quantity of item 2: ");
        int quantity_2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the price of item 3: ");
        int price_3 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the quantity of item 3: ");
        int quantity_3 = Integer.parseInt(sc.nextLine());
        float subtotal = ((price_1 * quantity_1) + (price_2 * quantity_2) + price_3 * quantity_3);
        System.out.println("Subtotal: $"+ subtotal);
        float tax = (float) (subtotal * 0.055);
        System.out.println("Tax: $"+ tax);
        float total = subtotal + tax;
        System.out.println("Total: $"+ total);





    }
}
