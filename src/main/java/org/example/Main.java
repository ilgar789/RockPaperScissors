package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            RockPaperScissors.gameInformation();
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            RockPaperScissors.RockPaperScissorsFunctions(RockPaperScissors.gameRandomNumbers(), b);
        }
    }
}