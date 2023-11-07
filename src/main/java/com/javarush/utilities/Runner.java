package com.javarush.utilities;

import com.javarush.IO.FileService;
import com.javarush.brute.force.CaeserCipherCracker;
import com.javarush.cipher.CaesarCipher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public void run() {
        System.out.println("введіть команду, шлях та ключ по черзі. Приклад" +
                "\ncrack /Users/olegtruskiy/projects/javarush-project-module1/src/main/java/com/javarush/utilities/test[ENCRYPT] 5");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        String path = scanner.next();
        int key = Integer.parseInt(scanner.next());
        CaesarCipher cipher = new CaesarCipher();
        FileService fileService = new FileService();
        ChoosingLanguage choosingLanguage = new ChoosingLanguage();

        if (operation.equalsIgnoreCase("encrypt")) {
            List<String> result2 = new ArrayList<>();
            List<String> oldStrings = fileService.readFile(path);
            if(choosingLanguage.isEnglish(oldStrings.get(0))){
                for(String s : oldStrings) {
                    result2.add(cipher.encryptForEngLanguage(s, key));
                }
            } else {
                for (String s : oldStrings) {
                    result2.add(cipher.encryptForUaLanguage(s, key));
                }
            }
            fileService.writeFile(path, operation.toUpperCase(), result2);
        } else if (operation.equalsIgnoreCase("decrypt")) {
            List<String> result = new ArrayList<>();
            List<String> oldStrings = fileService.readFile(path);
            String s = cipher.decryptForEngLanguage(oldStrings.get(0), key);
            if (choosingLanguage.isEnglish(s)) {
                for (String ss : oldStrings) {
                   result.add(cipher.decryptForEngLanguage(ss, key));
                }
            } else {
                for (String ss : oldStrings) {
                    result.add(cipher.encryptForUaLanguage(ss, key));
                }
            }
            fileService.writeFile(path, operation.toUpperCase(), result);
        } else if (operation.equalsIgnoreCase("crack")) {
            CaeserCipherCracker caesarCipher = new CaeserCipherCracker(fileService, cipher);
            int result = caesarCipher.caesarCipherCrackerForEnglish(path);
            if (result == -1) {
                result = caesarCipher.caesarCipherCrackerForUkrainian(path);
            }
            System.out.println(result);
        }
    }
}
