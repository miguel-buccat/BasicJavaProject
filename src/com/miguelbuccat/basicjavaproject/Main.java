package com.miguelbuccat.basicjavaproject;

import java.util.Scanner;

public class Main {
    static String name;
    static int age;
    static String address;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name ? : ");
        name = scan.nextLine();

        System.out.print("What is your age ? : ");
        age = Integer.parseInt(scan.nextLine());

        System.out.print("What is your address ? : ");
        address = scan.nextLine();

        GetDetails(name, age, address);

        scan.close();
    }

    public static void GetDetails(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
    public static void GetDetails(String name, int age, String address) {
        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your address is " + address);
    }
}
