package com.javarush;

import com.javarush.cipher.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        int key = 3;
        String ss = "фіфівіфвпкуеавимпва:??";
        System.out.println(ss);
        System.out.println(cipher.cryptForUaLanguage(ss, key));
        String result = cipher.cryptForUaLanguage(ss, key);
        System.out.println(cipher.decryptForUaLanguage(result, key));

        String s = "««««««asdfkbs v scvsdvsfsdf::: asdasd";
        System.out.println(s);
        String result1 = cipher.cryptForEngLanguage(s, key);
        System.out.println(result1);
        System.out.println(cipher.decryptForEngLanguage(result1, key));
    }
}
