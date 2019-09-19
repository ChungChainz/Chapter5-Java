package assignments;

import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int view;
        int parking;
        String result;
        System.out.print("Choose what view option you are looking for:" +
                "\n1- Park View\n2- Golf Course View\n3- Lake View");
        view = input.nextInt();
        System.out.print("Choose what parking option you are looking for:" +
                "\n1- Garage\n2- Parking Space");
        parking = input.nextInt();

        if(view == 1)
        {
            if(parking == 1)
            {
                result = ("The Park View condos are $155,000 with a garage.");
            }
            else
            {
                result = ("The Park View condos are $150,000.");
            }
        }
        else if(view == 2)
        {
            if(parking == 1)
            {
                result = ("The Golf Course View condos are $175,000 with a garage.");
            }
            else
            {
                result = ("The Golf Course View condos are $180,000.");
            }
        }
        else if(view == 3)
        {
            if(parking == 1)
            {
                result = ("The Lake View condos are $215,000 with a garage.");
            }
            else
            {
                result = ("The Lake View condos are $210,000.");
            }
        }
        else
        {
            result = ("INVALID");
        }
        System.out.println(result);
    }
}
