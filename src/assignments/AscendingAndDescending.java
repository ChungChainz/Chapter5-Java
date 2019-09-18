package assignments;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);

        int entry1;
        int entry2;
        int entry3;
        String result;
        String result1;
        System.out.print("Enter the first integer here >>> ");
        entry1 = input1.nextInt();


        System.out.print("Enter the second integer here >>> ");
        entry2 = input1.nextInt();


        System.out.print("Enter the third integer here >>> ");
        entry3 = input1.nextInt();

        if(entry1 > entry2 && entry1 > entry3)
        {
            if(entry2 > entry3)
            {
                result = ("Ascending order " + entry1 +" " + entry2 + " " + entry3);
                result1 = ("Descending order " + entry3 +" " + entry2 + " " + entry1);
            }
            else
            {
                result = ("Ascending order " + entry1 +" " + entry3 + " " + entry2);
                result1 = ("Ascending order " + entry2 + " " + entry3 + " " + entry1);
            }
        }
        else if(entry2 > entry1 && entry2 > entry3)
        {
            if(entry1 > entry3)
            {
                result = ("Ascending order " + entry2 +" " + entry1 + " " + entry3);
                result1 = ("Descending order " + entry3 +" " + entry1 + " " + entry2);
            }
            else
            {
                result = ("Ascending order " + entry2 + " " + entry3 + " " + entry1);
                result1 = ("Descending order " + entry1 +" " + entry3 + " " + entry2);
            }
        }
        else
        {
            if(entry1 > entry2)
            {
                result = ("Ascending order " + entry3 +" " + entry1 + " " + entry2);
                result1 = ("Descending order " + entry2 +" " + entry1 + " " + entry3);
            }
            else
            {
                result = ("Ascending order " + entry3 +" " + entry2 + " " + entry1);
                result1 = ("Descending order " + entry1 +" " + entry2 + " " + entry3);
            }
        }
        System.out.println(result + "\n" + result1);
    }
}
