package com.javarush.utilities;

import com.javarush.IO.FileService;
import com.javarush.brute.force.CaeserCipherCracker;
import com.javarush.cipher.CaesarCipher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private String path;
    private String operation;
    private int key;

    CaesarCipher cipher = new CaesarCipher();
    FileService fileService = new FileService();
    ChoosingLanguage choosingLanguage = new ChoosingLanguage();
    TalkingWithUser talkingWithUser = new TalkingWithUser();
    Scanner scanner;

    public void run() {
        talkingWithUser.sayHello();
        scanner = new Scanner(System.in);
        this.operation = scanner.next();
        this.path = scanner.next();

        if (operation.equalsIgnoreCase("encrypt")) {
            encrypt();
        } else if (operation.equalsIgnoreCase("decrypt")) {
            decrypt();
        } else if (operation.equalsIgnoreCase("crack")) {
            crack();
        } else {
            talkingWithUser.sayAboutMistake();
        }
    }

    public void encrypt() {
        talkingWithUser.askForKey();
        this.key = scanner.nextInt();
        List<String> encryptedText = new ArrayList<>();
        List<String> stringsFromGivenFile = fileService.readFile(path);
        String firstStringFromGivenFile = stringsFromGivenFile.get(0);
        if(choosingLanguage.isEnglish(firstStringFromGivenFile)){
            for(String s : stringsFromGivenFile) {
                encryptedText.add(cipher.encryptForEngLanguage(s, key));
            }
        } else {
            for (String s : stringsFromGivenFile) {
                encryptedText.add(cipher.encryptForUaLanguage(s, key));
            }
        }
        fileService.writeFile(path, operation.toUpperCase(), encryptedText);
    }

    public void decrypt() {
        talkingWithUser.askForKey();
        this.key = scanner.nextInt();
        List<String> decryptedStrings = new ArrayList<>();
        List<String> stringsFromGivenFile = fileService.readFile(path);
        String firstStringFromGivenFile = stringsFromGivenFile.get(0);
        String s = cipher.decryptForEngLanguage(firstStringFromGivenFile, key);
        if (choosingLanguage.isEnglish(s)) {
            for (String ss : stringsFromGivenFile) {
                decryptedStrings.add(cipher.decryptForEngLanguage(ss, key));
            }
        } else {
            for (String ss : stringsFromGivenFile) {
                decryptedStrings.add(cipher.encryptForUaLanguage(ss, key));
            }
        }
        fileService.writeFile(path, operation.toUpperCase(), decryptedStrings);
    }

    public void crack() {
        CaeserCipherCracker caesarCipher = new CaeserCipherCracker(fileService, cipher);
        int result = caesarCipher.caesarCipherCrackerForEnglish(path);
        if (result == -1) {
            result = caesarCipher.caesarCipherCrackerForUkrainian(path);
        }
        System.out.println(result);
    }
}
