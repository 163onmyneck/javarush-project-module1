package com.javarush.cipher;

import com.javarush.constants.Constants;
import com.javarush.utilities.StringUtility;

import java.util.ArrayList;

public class CaesarCipher {

    public String encryptForEngLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = StringUtility.getCharsFromString(string);
        ArrayList<Character> engChars = Constants.getAlphabeticEn();
        for (int i = 0; i < chars.size(); i++) {
            int index = engChars.indexOf(chars.get(i));
            if (index != -1) {
                index = (index + key) % engChars.size();
                if (index < 0) {
                    index += engChars.size();
                }
                stringBuilder.append(engChars.get(index));
            } else {
                stringBuilder.append(chars.get(i));
            }
        }
        return stringBuilder.toString();
    }

    public String encryptForUaLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = StringUtility.getCharsFromString(string);
        ArrayList<Character> uaChars = Constants.getAlphabeticUa();
        for (int i = 0; i < chars.size(); i++) {
            int index = uaChars.indexOf(chars.get(i));
            if (index != -1) {
                index = (index + key) % uaChars.size();
                if (index < 0) {
                    index += uaChars.size();
                }
                stringBuilder.append(uaChars.get(index));
            } else {
                stringBuilder.append(chars.get(i));
            }
        }
        return stringBuilder.toString();
    }

    public String decryptForUaLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = StringUtility.getCharsFromString(string);
        ArrayList<Character> uaChars = Constants.getAlphabeticUa();
        for (int i = 0; i < chars.size(); i++) {
            int index = uaChars.indexOf(chars.get(i));
            if (index != -1) {
                index = (index - key) % uaChars.size();
                if (index < 0) {
                    index += uaChars.size();
                }
                stringBuilder.append(uaChars.get(index));
            } else {
                stringBuilder.append(chars.get(i));
            }
        }
        return stringBuilder.toString();
    }

    public String decryptForEngLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = StringUtility.getCharsFromString(string);
        ArrayList<Character> engChars = Constants.getAlphabeticEn();
        for (int i = 0; i < chars.size(); i++) {
            int index = engChars.indexOf(chars.get(i));
            if (index != -1) {
                index = (index - key) % engChars.size();
                if (index < 0) {
                    index += engChars.size();
                }
                stringBuilder.append(engChars.get(index));
            } else {
                stringBuilder.append(chars.get(i));
            }
        }
        return stringBuilder.toString();
    }
}
