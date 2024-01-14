package NumberGame;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    private int generatedNumber;
    private int userScore;
    private final Scanner scanner;
    private int attemps = 0;

    public NumberGame() {
        this.generatedNumber = generateRandomNumber();
        this.userScore = 0;
        this.attemps=0;
        this.scanner = new Scanner(System.in);
    }
        public int generateRandomNumber(){
        Random rand = new Random();
        generatedNumber = rand.nextInt(100) + 1;
        return generatedNumber;
    }
    public NumberGame(Scanner scanner) {
        this.scanner = scanner;

    }
    private int getUserGuess() {
        System.out.println("Guess number: ");
        return scanner.nextInt();
    }
    public void playGame() {
        generatedNumber=generateRandomNumber();
        System.out.println("Try to guess the randomly generated number between 1 and 100.");

        int userGuess;
        do {
            userGuess = getUserGuess();
            String feedback = evaluateGuess(userGuess);
            System.out.println(feedback);
        } while (userGuess != generatedNumber);

        System.out.println("Congratulations! You guessed the number!");
        resetGame();
    }

    public String evaluateGuess(int userGuess) {
        if (userGuess == generatedNumber) {
            attemps++;
            userScore++;
            return "Correct! You guessed the number in " + attemps + " attempts.\n Your score is "+userScore;
        } else if (userGuess < generatedNumber) {
            attemps++;
            return "Too low! Try again.";
        } else {attemps++;
            return "Too high! Try again.";
        }
    }
    public String displayScore() {
        return "Your current score is: " + userScore + " attempts.";
    }

    public void resetGame() {

        attemps = 0;
    }}
//    public void startGame(){
//
//
//}
