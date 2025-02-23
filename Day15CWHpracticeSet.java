import java.util.*;
/*
* Today i am doing a problem given by CWH
* Create a class Game, which allows a user to play "Guess the Number" game once.
*
* Game should have the following methods:
* Constructor to generate the random number
* takeUserInput() to take a user input of number
* isCorrectNumber() to detect whether the number entered by the user is true
* getter and setter for noOfGuesses
* Use properties such as noOfGuesses(int), etc to get this task done!
*/

class Game {
    private int RandomNum;
    private int UserNum;
    private int noOfGuesses = 0;

    public Game() {
        Random r1 = new Random();
        RandomNum = r1.nextInt(101);
    }

    public void takeUserInput(int num) {
        if (num < 0) {
            System.out.println("Invalid number or Negative!!!");
        }
        UserNum = num;
    }

    public boolean isCorrectNumber() {
        if (RandomNum == UserNum) {
            System.out.println("\uD83C\uDF89 Congratulations! You found the number!");
            System.out.println("Number of guesses : " + setNoOfGuess());
            score();
            return true;
        } else if (RandomNum > UserNum) {
            System.out.println("The number is greater than your number.");
        } else {
            System.out.println("The number is smaller than your number.");
        }
        return false;
    }

    public void getNoOfGuess() {
        noOfGuesses++;
    }

    public int setNoOfGuess() {
        return noOfGuesses;
    }

    public void score() {

        if (noOfGuesses <= 5) {
            System.out.println("You scored : ⭐⭐⭐⭐⭐");
        } else if (noOfGuesses <= 10) {
            System.out.println("You scored : ⭐⭐⭐⭐");
        } else if (noOfGuesses <= 15) {
            System.out.println("You scored : ⭐⭐⭐");
        } else if (noOfGuesses < 30) {
            System.out.println("You scored : ⭐⭐");
        } else if (noOfGuesses > 30) {
            System.out.println("You scored : ⭐");
        }
    }

    public void generateNewNumber()
    {
        Random r2 = new Random();
        RandomNum = r2.nextInt(101);
        System.out.println(RandomNum);
    }
}
public class Day15CWHpracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game p1 = new Game();
        boolean guessed;
        int option;

        System.out.println("--------------------------Guess The Number Game Between(0 to 100)--------------------------");
        do {
            System.out.println("Option :\n1.Play the Game\n2.End the Game\nSelect an Option: ");
            option = sc.nextInt();
            switch(option)
            {
                case 1 :
                    guessed = false; // used as a flag
                    while(!guessed) {
                        System.out.println("Enter a Number: ");
                        int num = sc.nextInt();
                        p1.takeUserInput(num);
                        p1.getNoOfGuess();
                        guessed = p1.isCorrectNumber();
                    }
                    System.out.println("Do you want to play again? (yes/no)");
                    sc.nextLine();
                    String playAgain = sc.nextLine().trim().toLowerCase(); //it will trim spaces and lowercase the input
                    if (playAgain.equals("yes")) {
                        p1.generateNewNumber();
                        guessed = false;
                    } else {
                        System.out.println("Quiting Game...");
                        option = 2;
                    }
                    break;
                case 2 :
                    System.out.println("Quiting Game...");
                    break;
                default:
                    System.out.println("Invalid option..!!!!");
            }
        }while(option != 2);
    }
}
