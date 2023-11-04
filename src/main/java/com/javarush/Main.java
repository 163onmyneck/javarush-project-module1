package com.javarush;

import com.javarush.IO.FileService;
import com.javarush.cipher.CaesarCipher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        int key = 1;
        /* String ss = "ІВФІВФФААААуеавимпва:??";
        System.out.println(ss);
        System.out.println(cipher.cryptForUaLanguage(ss, key));
        String result = cipher.cryptForUaLanguage(ss, key);
        System.out.println(cipher.decryptForUaLanguage(result, key));

        String s = "ASDSADASVDSETR";
        System.out.println(s);
        String result1 = cipher.cryptForEngLanguage(s, key);
        System.out.println(result1);
        System.out.println(cipher.decryptForEngLanguage(result1, key));*/

        FileService fileService = new FileService();
        List<String> result3 = fileService.readFile("src/main/java/com/javarush/IO/file");
        List<String> result5 = new ArrayList<>();
        for (String yy : result3) {
            String s = cipher.cryptForEngLanguage(yy, key);
            result5.add(s);
        }

        fileService.writeFile("src/main/java/com/javarush/IO/file", "ENCTYPT", result5);
    }
}
