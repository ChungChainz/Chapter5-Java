package examples;

import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args)
    //user enters age and then it spits back an insult
    //school appropriate hopefully
    {
        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age here >>> ");
        age = input.nextInt();

        if(age < 12)
        {
            System.out.println("You are just a kid, go away.");
        }
        else if(age >= 12 && age < 19)
        {
            System.out.println("You are old enough to know better, hopefully.");
        }
        else if(age >= 25 && age < 35)
        {
            System.out.println("You're going through your mid life crisis now aren't ya.");
        }
        else if(age >= 35 && age < 45)
        {
            System.out.println("You must be really bored at that office job of yours.");
        }
        else if(age >= 45 && age < 55)
        {
            System.out.println("Shame you haven't retired yet and you're still here.");
        }
        else
        {
            System.out.println("I'm impressed to even see you here still.");
        }
    }
}
