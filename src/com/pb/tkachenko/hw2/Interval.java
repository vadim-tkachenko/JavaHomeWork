package com.pb.tkachenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=0&a<=14){
            System.out.println("[0 - 14]");
        }else if(a>=14&a<=35){
            System.out.println("[15 - 35]");
        }else if(a>=36&a<=50){
            System.out.println("[36 - 50]");
        }else if(a>=51&a<=100){
            System.out.println("[51 - 100]");
        }else{
            System.out.println("Число не входит в интервал 0 - 100");
        }
    }
}