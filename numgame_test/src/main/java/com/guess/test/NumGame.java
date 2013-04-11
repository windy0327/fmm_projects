package com.guess.test;

public class NumGame
{
    public static Integer randomNum=0;
    public static void getRandomNum()
    {
        randomNum = (int) (Math.random()*9000+1000);
    }

    public static String get_result_of_comparing_two_numbers(Integer a,Integer b)
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
}

