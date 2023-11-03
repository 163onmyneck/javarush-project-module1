package com.javarush.cipher;

import com.javarush.constants.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaesarCipher {

    public static ArrayList<Character> getCharsFromString(String string) {
        char[] chars = string.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char c : chars) {
            characterArrayList.add(c);
        }
        return characterArrayList;
    }

    public String cryptForEngLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = CaesarCipher.getCharsFromString(string);
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

    public String cryptForUaLanguage(String string, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> chars = CaesarCipher.getCharsFromString(string);
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
}
