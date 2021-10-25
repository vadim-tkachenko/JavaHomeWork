package com.pb.tkachenko.hm4;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост"));
        System.out.println(isAnagram("Я в мире — сирота. -> Я в Риме — Ариост"));
        System.out.println(isAnagram("Я хочу жить в мире -> Ром жизнь круто"));
    }
    public static boolean isAnagram (String text){
        /*
        isAnagram(String)->boolean;

        >>isAnagram("Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост") -> true
        >>isAnagram("Я в мире — сирота. -> Я в Риме — Ариост") -> true
        >>isAnagram("Я хочу жить в мире -> Ром жизнь круто") -> false
         */
        String s1 = text.toUpperCase().replaceAll("[^А-Яа-я]", "");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean answer = true;
        for (int count=0; count<s1.length(); count++){
            if (s1.charAt(count) !=s2.charAt(count)){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
