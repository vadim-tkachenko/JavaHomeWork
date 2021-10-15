package com.pb.tkachenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String sign = scan1.nextLine();
        switch (sign) {
            case ("+"):
                System.out.println(a + b);
                break;
            case ("-"):
                System.out.println(a - b);
                break;
            case ("/"):
                if(a==0 |b==0){
                    System.out.println("Нельзя делить на ноль");
                    break;
                }
                System.out.println(a / b);
                break;
            case ("*"):
                System.out.println(a * b);
                break;
        }
    }
}