package assignments;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int talkMinutes;
        int textMessages;
        int gigabytesUsed;
        String plan;
        System.out.print("Welcome to Horizon Phones:\n" +
                "Enter the maximum amount of minutes of talk you'll use here >>> ");
        talkMinutes = input.nextInt();


        System.out.print("Enter the maximum amount of text messages you'll have here >>> ");
        textMessages = input.nextInt();


        System.out.print("Enter the maximum amount of gigabytes you'll use here >>> ");
        gigabytesUsed = input.nextInt();

        if(talkMinutes < 500)
        {
            if(textMessages == 0 && gigabytesUsed == 0)
            {
                plan = ("We recommend our Plan A for $49 per month.");
            }
            else
            {
                plan = ("We recommend our Plan B for $55 per month.");
            }
        }
        else if(talkMinutes >= 500)
        {
            if(gigabytesUsed == 0 && textMessages < 100)
            {
                plan = ("We recommend our Plan C for up to 100 text messages for $61 per month.");
            }
            else if(gigabytesUsed == 0 && textMessages >= 100)
            {
                plan = ("We recommend our Plan D for 100 text messages or more for $70 per month.");
            }
            else if(gigabytesUsed < 2)
            {
                plan = ("We recommend our Plan E for up to 2 gigabytes for $79 per month.");
            }
            else
            {
                plan = ("We recommend our Plan F for 2 gigabytes or more for $87 per month.");
            }
        }
        else
        {
            plan = ("INVALID");
        }
        System.out.println(plan);
    }

}
