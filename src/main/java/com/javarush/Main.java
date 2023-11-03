package com.javarush;

import com.javarush.cipher.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        String s = "««««««asdfkbs v scvsdvsfsdf::: asdasd";
        int key = 1;
        System.out.println(cipher.cryptForEngLanguage(s, key));
        String ss = "фіфівіфвпкуеавимпва:??";
        System.out.println(cipher.cryptForUaLanguage(ss, key));
    }
}
