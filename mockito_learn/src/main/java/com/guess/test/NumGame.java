package com.guess.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumGame
{
    public static Integer randomNum=0;

    public static void getRandomNum()
    {
        randomNum = (int) (Math.random()*9000+1000);
    }

    public static String getGameResult(Integer a,Integer b)
    {
        int how_many_A=0;
        int how_many_B=0;

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a.toString().charAt(i)==b.toString().charAt(j)&&i==j)
                {
                    how_many_A++;
                }
                if(a.toString().charAt(i)==b.toString().charAt(j)&&i!=j)
                {
                    how_many_B++;
                }
            }
        }

        return how_many_A+"A"+how_many_B+"B";
    }

    public static void playGame(Integer num,BufferedReader reader)
    {
        for(int i=0;i<6;i++)
        {
            System.out.println("请输入一个四位数：");

            Integer inputNum = inputNum(reader);

            System.out.println(NumGame.getGameResult(inputNum, num));

            if(num==inputNum)
            {
                System.out.println("Congratulations!");
                break;
            }
        }

        System.out.println("Game over!");
    }

    public static Integer inputNum(BufferedReader reader) {
        Integer inputNum = null;
        try
        {

            inputNum = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputNum;
    }
}
