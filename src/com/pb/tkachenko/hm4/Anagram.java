package com.pb.tkachenko.hm4;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Аз есмь строка живу я мерой остр", "За семь морей ростка я вижу рост"));
        System.out.println(isAnagram("Я в мире — сирота", "Я в Риме — Ариост"));
        System.out.println(isAnagram("Я хочу жить в мире", "Ром жизнь круто"));
    }

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }
}