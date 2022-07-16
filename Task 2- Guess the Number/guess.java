package GuessTheNumber;

import java.util.Scanner;
import java.util.Random;

class Game {
    int noOfGuesses;
    int number;
    int UserInput;

    public void setNo() {
        noOfGuesses = 0;
    }

    public int getNo() {
        return noOfGuesses;
    }

    public Game() {
        Random nom = new Random();
        number = nom.nextInt(101);
    }

    public void takeUserInput() {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
    }

    public void isCorrectNumber() {
        if (UserInput == number) {
            noOfGuesses += 1;
            System.out.println("\nYou guessed correct number in " + getNo() + " guesses.");
        } else {
            noOfGuesses += 1;
            if (UserInput > number) {
                System.out.println("\nGuess smaller number");
                takeUserInput();
                isCorrectNumber();
            } else {
                System.out.println("\nGuess bigger number");
                takeUserInput();
                isCorrectNumber();
            }
        }
    }
}
public class guess {

    public static void main(String[] args) {
        Game a = new Game();
        a.setNo();
        a.takeUserInput();
        a.isCorrectNumber();
    }
}
