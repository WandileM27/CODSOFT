package NumberGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner doOver = new Scanner(System.in);
        NumberGame game = new NumberGame();
//        String start="";
        System.out.println("Welcome to the Number Guessing Game!");
        String start;
        do {

            game.playGame();
            System.out.println("Do you want to play again? (yes/no): ");
            start = doOver.next();

        } while (start.equals("yes"));

        System.out.println("Thank you for playing!");
    }}
