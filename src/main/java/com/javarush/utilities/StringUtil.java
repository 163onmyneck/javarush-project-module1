package com.javarush.utilities;

import java.util.ArrayList;

public class StringUtil {

    public static ArrayList<Character> getCharsFromString(String string) {
        char[] chars = string.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char c : chars) {
            characterArrayList.add(c);
        }
        return characterArrayList;
    }

}
