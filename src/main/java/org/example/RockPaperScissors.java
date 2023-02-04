package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    int a = (int) ( Math.random() * 3 );

    public static void gameInformation(){
        String string[]={" 1) Rock "," 2) Paper "," 3) Scissors "};
        System.out.println("Lets start a game ");
        System.out.println("Make your choice ");
        System.out.println(Arrays.toString(string));
    }

    public static int gameRandomNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = (int) ( Math.random() * 3 );
        System.out.println("Computer Choice :"+ (a+1));
        return a;
    }

    public static void RockPaperScissorsFunctions(int a,int b){

        if(a == 0 & b == 2){
            System.out.println("You Win");
        }else if(a == 0 & b == 1){
            System.out.println("Draw");
        }else if(a == 0 & b ==3){
            System.out.println("you Lost");
        }else if(a == 1 & b == 1){
            System.out.println("You Lost");
        }else if(a == 1 & b == 3){
            System.out.println("You Win");
        }else if(a == 1 & b == 2){
            System.out.println("Draw");
        }else if(a == 2 & b ==3){
            System.out.println("Draw");
        }else if(a == 2 & b == 2) {
            System.out.println("You Win");
        }else if(a ==2 & b == 1){
            System.out.println("You Lost");
        }

    }
    public static void main(String[] args) {
        int a = (int) ( Math.random() * 3 );
        System.out.println(a);
        RockPaperScissors.gameInformation();
    }
}
