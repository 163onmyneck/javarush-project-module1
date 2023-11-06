package com.javarush;

import com.javarush.IO.FileService;
import com.javarush.brute.force.CaeserCipherCracker;
import com.javarush.cipher.CaesarCipher;
import com.javarush.utilities.ChoosingLanguage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        int key = 3;
        String ss = "ІВФІВФФААААуеавимпва:??";
        System.out.println(ss);
        System.out.println(cipher.cryptForUaLanguage(ss, key));
        String result = cipher.cryptForUaLanguage(ss, key);
        System.out.println(cipher.decryptForUaLanguage(result, key));

        String s = "ASDSADASVDSETR";
        System.out.println(s);
        String result1 = cipher.cryptForEngLanguage(s, key);
        System.out.println(result1);
        System.out.println(cipher.decryptForEngLanguage(result1, key));

       FileService fileService = new FileService();
       /* List<String> result3 = fileService.readFile("/Users/olegtruskiy/projects/javarush-project-module1/src/main/java/com/javarush/text");
        List<String> result5 = new ArrayList<>();
        for (String yy : result3) {
            String s1 = cipher.cryptForEngLanguage(yy, key);
            result5.add(s1);

            fileService.writeFile("/Users/olegtruskiy/projects/javarush-project-module1/src/main/java/com/javarush/text", "ENCTYPT", result5); */

            CaeserCipherCracker bruteForce = new CaeserCipherCracker(fileService, cipher);
            int i = bruteForce.caesarCipherCrackerForEnglish("/Users/olegtruskiy/projects/javarush-project-module1/src/main/java/com/javarush/text[ENCTYPT]");
            System.out.println(i);

        }
    }


