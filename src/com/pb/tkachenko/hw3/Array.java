package com.pb.tkachenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // Считывание чисел от пользователя
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив:");
        int [] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }

        //Вывод заполненного массива на экран (
        System.out.print("Заполненый массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        //Check пузыриком
        boolean swap = true;
        int temp;
        while(swap){
            swap = false;
            for(int i = 0;i < mas.length-1; i++){
                if(mas[i] > mas[i+1]){
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    swap = true;
                }
            }
        }
        System.out.println("\nОтсортированный массив методом пузырька от меньшего к большему: " + Arrays.toString(mas));

        //Выведение количество mas[i] больше 0
        int num = 0;
        int elSum = 0;
        for (int i = 0; i < mas.length; i++) {
            elSum += i;
            if (mas[i] > 0) {
                num++;
            }

        }
        System.out.println("Количество элементов больше нуля: " + num + ". Сумма элементов массива: " + elSum + ".");
    }
}