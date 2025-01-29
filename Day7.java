import java.util.Scanner;
import java.util.Random;
public class Day7 {
    public static void main(String[] args)
    {
//        Today I am going to solve exercise from CodeWithHarry. I am making a game.
//        Game : Rock Paper Scissors
//        Harry give us hint to search java.util.Random
//        Then i got a idea

        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK...PAPER...SCISSORS");
        int option,comp;
        //Random input is taken from this
        Random r = new Random();
        do {
            System.out.println("\nSelect a option: ");
            System.out.print("1.Rock\n2.Paper\n3.Scissors\n4.Exit\nYour option : ");
            option = sc.nextInt();
            switch (option)
            {
                case 1 -> System.out.println("\nYou : Rock");
                case 2 -> System.out.println("\nYou : Paper");
                case 3 -> System.out.println("\nYou : Scissors");
                default -> System.out.println("Invalid option!!!");
            }
            if(option == 4 || option > 4)
                break;
            comp = r.nextInt(4);
            if(comp == 0)
            {
                comp++;
            }
            if(comp == 1)
            {
                System.out.println("Computer : Rock");
            }else if(comp == 2) {
                System.out.println("Computer : Paper");
            }else if(comp == 3){
                System.out.println("Computer : Scissors");
            }

            System.out.println("|           Here's the Result         |");
            if(option == comp)
            {
                System.out.println("Draw");
                System.out.println("Try Again....!!");
            }
            else if((option == 1 && comp == 3) || (option == 2 && comp == 1) || (option == 3 && comp == 2))
            {
                System.out.println("You Wins : )");
                System.out.println("Nice.....!!");
            }
            else
            {
                System.out.println("Computer Wins : (");
                System.out.println("Better Luck Next Time...!!");
            }
        }while(option != 4);


//      It is a bit confusing and a bit difficult.
//      But I tried my best and I took help from Google and some help from comments.
//      But I learned new things....Random class...and how to bound a input.





    }
}
