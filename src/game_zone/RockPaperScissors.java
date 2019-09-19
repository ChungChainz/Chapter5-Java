package game_zone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int userInput;
        int compInput = rand.nextInt(3) + 1;
        String result;

        System.out.println("Please enter a number between 1 and 3\n" +
                "1- Rock\n2- Paper\n3-Scissors");
        userInput = input.nextInt();
        if (userInput == 1)
        {
            if(compInput == 1)
            {
                result = ("The computer choose rock, it is a Tie!");
            }
            else if(compInput == 2)
            {
                result = ("The computer choose paper, YOU LOSE!");
            }
            else if(compInput == 3)
            {
                result = ("The computer choose scissors, YOU WIN");
            }
            else
            {
                result = ("INVALID, TRY AGAIN");
            }

        }
        else if(userInput == 2)
        {
            if(compInput == 1)
            {
                result = ("The computer choose rock, YOU WIN");
            }
            else if(compInput == 2)
            {
                result = ("The computer choose paper, it is a Tie!");
            }
            else if(compInput == 3)
            {
                result = ("The computer choose scissors, YOU LOSE!");
            }
            else
            {
                result = ("INVALID, TRY AGAIN");
            }
        }
        else
        {
            if(compInput == 1)
            {
                result = ("The computer choose rock, YOU LOSE");
            }
            else if(compInput == 2)
            {
                result = ("The computer choose paper, YOU WIN");
            }
            else if(compInput == 3)
            {
                result = ("The computer choose scissors, it is a Tie!");
            }
            else
            {
                result = ("INVALID, TRY AGAIN");
            }
        }
        System.out.println(result);
    }
}
