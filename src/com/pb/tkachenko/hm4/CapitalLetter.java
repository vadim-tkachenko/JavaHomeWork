package com.pb.tkachenko.hm4;

import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите необходимое значение: ");
        String name = in.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (isLetterOrDigit(name.charAt(i)) && (i == 0 || !isLetterOrDigit(name.charAt(i - 1)))){
                char[] nameChars = name.toCharArray();
                nameChars[i] = Character.toUpperCase(nameChars[i]);
                name = String.valueOf(nameChars);
            }
        }
        System.out.println(name);
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'а' && c <= 'я') ||
                (c >= 'А' && c <= 'Я') ||
                (c >= '0' && c <= '9');
    }
}