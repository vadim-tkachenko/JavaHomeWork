package com.pb.tkachenko.hm4;

public class CapitalLetter {
    public static void main(String[] args) {

        String name = "Истина — это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println("Original String: " + name);
        String firstLetStr = name.substring(0, 1);
        String remLetStr = name.substring(1);

        firstLetStr = firstLetStr.toUpperCase();

        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println("String with first letter as Capital: " + firstLetterCapitalizedName);

    }
}
