package com.javarush.brute.force;

import com.javarush.IO.FileService;
import com.javarush.cipher.CaesarCipher;
import com.javarush.constants.Constants;
import com.javarush.utilities.ChoosingLanguage;

import java.util.List;

public class CaeserCipherCracker {

    FileService fileService;
    CaesarCipher caesarCipher;
    ChoosingLanguage choosingLanguage = new ChoosingLanguage();

    public CaeserCipherCracker(FileService fileService, CaesarCipher caesarCipher) {
        this.caesarCipher = caesarCipher;
        this.fileService = fileService;
    }

    public int caesarCipherCrackerForEnglish(String path) {
        List<String> strings = fileService.readFile(path);
        int keys = Constants.getCommonEnglishWords().size();
        for (int key = 0; key < keys; key++) {
            for (String s : strings) {
                String decryptedString = caesarCipher.decryptForEngLanguage(s, key);
                if (choosingLanguage.isEnglish(decryptedString)) {
                    return key;
                }
            }
        }
        return -1;
    }

    public int caesarCipherCrackerForUkrainian(String path) {
        List<String> strings = fileService.readFile(path);
        int keys = Constants.getCommonUkrainianWords().size();
        for (int key = 0; key < keys; key++) {
            for (String s : strings) {
                String decryptedString = caesarCipher.decryptForUaLanguage(s, key);
                if (choosingLanguage.isUkrainian(decryptedString)) {
                    return key;
                }
            }
        }
        return -1;
    }
}
