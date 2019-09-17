package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int choice;
        int rng = rand.nextInt(10) + 1;

        System.out.println("Please pick a number between 1 and 10 >>> ");
        choice = input.nextInt();

        if (choice == rng)
        {
            System.out.println("Congrats, you are a good guesser!");
        }
        else if (choice > rng)
        {
            System.out.println("Nope it was lower. It was " + rng);
        }
        else if (choice < rng)
        {
            System.out.println("Nope it was higher. It was " + rng);
        }

    }
}
