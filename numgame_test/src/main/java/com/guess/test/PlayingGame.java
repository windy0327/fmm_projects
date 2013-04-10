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
      for(int i=0;i<4;i++)
      {
        System.out.println("请输入一个四位数：");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer input_num = Integer.parseInt(reader.readLine());
        System.out.println(numGame.get_result_of_comparing_two_numbers(input_num,numGame.get_random_num_created()));
      }
    }
    System.out.println("游戏结束");
}

