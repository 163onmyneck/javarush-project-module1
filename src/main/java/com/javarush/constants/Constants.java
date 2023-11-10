package com.javarush.constants;

import java.util.*;

public class Constants {
    private final static ArrayList<Character> ALPHABETIC_EN = new ArrayList<>(
            Arrays.asList(
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                    '.', ',', '"', '!', '?', ';', ':', ' ', '»', '«'));

    private final static ArrayList<Character> ALPHABETIC_UA = new ArrayList<>(
            Arrays.asList(
                    'А', 'Б', 'В', 'Г', 'Ґ', 'Д', 'Е', 'Є', 'Ж', 'З', 'И', 'І', 'Ї',
                    'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
                    'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ю', 'Я',
                    'а', 'б', 'в', 'г', 'ґ', 'д', 'е', 'є', 'ж', 'з', 'и', 'і', 'ї',
                    'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х',
                    'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я', '.', ',', '"', '!', '?', ';', ':', ' ', '»', '«'));

    public static ArrayList<Character> getAlphabeticEn() {
        return ALPHABETIC_EN;
    }

    public static ArrayList<Character> getAlphabeticUa() {
        return ALPHABETIC_UA;
    }

    private static final HashSet<String> COMMON_ENGLISH_WORDS = new HashSet<>(
            Arrays.asList(
                    "the", "be", "a", "of", "in", "on", "I", "have", "is", "up", "are", "am", "it", "this"
            ));

    private static final HashSet<String> COMMON_UKRAINIAN_WORDS = new HashSet<>(
            Arrays.asList(
                    "та", "і", "у", "на", "з", "не", "в", "що", "це", "він",
                    "вона", "ми", "ти", "вони", "бути", "мати", "що", "для", "як", "також",
                    "цей", "але", "той", "який", "тут", "як", "коли", "дуже", "багато", "всі"
            ));

    public static HashSet<String> getCommonEnglishWords(){
        return COMMON_ENGLISH_WORDS;
    }

    public static HashSet<String> getCommonUkrainianWords() {
        return COMMON_UKRAINIAN_WORDS;
    }
}
