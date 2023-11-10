package com.javarush;

import com.javarush.utilities.Runner;
import com.javarush.utilities.TalkingWithUser;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
       /* TalkingWithUser talkingWithUser = new TalkingWithUser();
        if (args.length == 0) {
            runner.run();
        } else if (args.length > 2) {
            String operation = args[0];
            String filePath = args[1];
            int key = Integer.valueOf(args[2]);
            runner.setOperation(operation);
            runner.setPath(filePath);
            runner.setKey(key);
            if (operation.equalsIgnoreCase("encrypt")) {
                runner.encrypt();
            } else if (operation.equalsIgnoreCase("decrypt")) {
                runner.decrypt();
            } else if (operation.equalsIgnoreCase("crack")) {
                runner.crack();
            }
        } else {
            talkingWithUser.sayAboutMistake();
        } */
    }
}


