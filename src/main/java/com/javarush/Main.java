package com.javarush;

import com.javarush.utilities.Runner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();

        System.out.println("Comand: " + args[0]);
        System.out.println("Path to file: " + args[1]);
        System.out.println("key: " + args[2]);
    }
}


