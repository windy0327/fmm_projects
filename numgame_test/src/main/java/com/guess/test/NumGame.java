package com.guess.test;

/**
 * Created with IntelliJ IDEA.
 * User: fmm
 * Date: 13-4-3
 * Time: 下午5:38
 * To change this template use File | Settings | File Templates.
 */
public class NumGame {
    public static Integer  create_four_digits_random_num(){
        int random_num = (int) (Math.random()*1000);

        return random_num;
    }
    public static String get_result_of_comparing_two_numbers(int a,int b){
        if(a==b){return "4A0B";}
        else return "wrong";
    }
}
