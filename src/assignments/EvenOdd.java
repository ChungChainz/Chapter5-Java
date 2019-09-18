package assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        int num;
        String result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer here >>> ");
        num = input.nextInt();

        if(num % 2 == 0)
        {
            result = "Even";
            System.out.println(result);
        }
        else
        {
            result = "Odd";
            System.out.println(result);
        }
    }
}
