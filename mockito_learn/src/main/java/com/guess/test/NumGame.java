package com.guess.test;

import java.io.*;

public class NumGame {
    public static Integer randomNum = 0;


    public static void getRandomNum() {
        randomNum = (int) (Math.random() * 9000 + 1000);
    }

    public static String getGameResult(Integer inputNum, Integer randomNum) {
        int how_many_A = 0;
        int how_many_B = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (inputNum.toString().charAt(i) == randomNum.toString().charAt(j) && i == j) {
                    how_many_A++;
                }
                if (inputNum.toString().charAt(i) == randomNum.toString().charAt(j) && i != j) {
                    how_many_B++;
                }
            }
        }

        return how_many_A + "A" + how_many_B + "B";
    }

    public static Integer inputNum(BufferedReader reader) {
        Integer inputNum = null;
        try {
            inputNum = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputNum;
    }

    public static void playGame(Integer num, BufferedReader reader, PrintStream mockOut) {

        Integer inputNum = null;
        for (int i = 0; i < 6; i++) {
            mockOut.println("请输入一个四位数：");

            inputNum = inputNum(reader);
            mockOut.println(NumGame.getGameResult(inputNum, num));

            if (inputNum.intValue() == num.intValue()) {
                mockOut.println("Congratulations!");
                break;
            }
        }

        if (inputNum.intValue() != num.intValue()) {
            mockOut.println("Game over!");
        }
    }

    public static void makeDigitsDifferent() {
        NumGame.getRandomNum();

        int j = 0;
        boolean isDifferent = false;
        String randomNumStr = randomNum.toString();
        for (int i = 0; !isDifferent; i++) {
            if (randomNumStr.charAt(j) != randomNumStr.charAt(j + 1) && randomNumStr.charAt(j + 1) != randomNumStr.charAt(j + 2) && randomNumStr.charAt(j + 2) != randomNumStr.charAt(j + 3)) {
                isDifferent = true;
            } else {
                NumGame.getRandomNum();
            }
        }
    }
}
