package com.javarush.utilities;

public class TalkingWithUser {

    public void sayHello() {
        System.out.println("Hi! Welcome to my program.");
        System.out.println("Here you can encrypt, decrypt and crack your text.");
        System.out.println("To continue type: command, path to file, key");
        System.out.println("Commands: ENCRYPT, DECRYPT, CRACK");
    }

    public void askForKey() {
        System.out.println("Choose key, please!");
    }

    public void sayAboutMistake() {
        System.out.println("Something went wrong..");
    }
}
