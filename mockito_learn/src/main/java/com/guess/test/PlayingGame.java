package com.guess.test;

import com.guess.test.NumGame;

import java.io.*;
import java.lang.System;

public class PlayingGame {
    public static void main(String args[]) throws IOException {
        NumGame numGame = new NumGame();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numGame.makeDigitsDifferent();

        for (int i = 0; i < 6; i++) {
            numGame.playGame(numGame.randomNum, reader, System.out);
        }

        System.out.println("Game over!");
    }
}

