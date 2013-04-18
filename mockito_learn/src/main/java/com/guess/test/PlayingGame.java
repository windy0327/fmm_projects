package com.guess.test;

import com.guess.test.NumGame;

import java.io.*;
import java.lang.System;

public class PlayingGame {
    public static void main(String args[]) throws IOException {
        NumGame numGame = new NumGame();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numGame.makeDigitsDifferent();


         numGame.playGame(numGame.randomNum, reader, System.out);

    }
}

