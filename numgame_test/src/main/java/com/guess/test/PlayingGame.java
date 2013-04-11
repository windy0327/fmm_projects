package com.guess.test;
import com.guess.test.NumGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.System;

public class PlayingGame
{
    public static void main(String args[]) throws IOException
    {
      NumGame numGame=new NumGame();
      numGame.getRandomNum();
      numGame.playGame(numGame.randomNum);
}

