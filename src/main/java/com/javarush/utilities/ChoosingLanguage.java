package com.javarush.utilities;

import com.javarush.constants.Constants;

import java.util.Set;

public class ChoosingLanguage {


    public boolean isEnglish(String text) {
        Set<String> commonWordsSet = Constants.getCommonEnglishWords();
        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (commonWordsSet.contains(word)) {
                return true;
            }
        }

        return false;
    }

    public boolean isUkrainian(String text) {
        Set<String> commonWordsSet = Constants.getCommonUkrainianWords();
        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (commonWordsSet.contains(word)) {
                return true;
            }
        }

        return false;
    }
}
