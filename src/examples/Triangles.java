package examples;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args)
    {
        //Triangle Program
        //Solving for right, isosceles, and equilateral
        // solve for perimeter, sides, and area
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for? \n-1 - for right triangles \n " +
                "2 - for isosceles \n3- for equilateral \nChoice >>>");
        choice = input.nextInt();

        if (choice == 1)
        {
            rightTriangle();
        }
        else if (choice == 2)
        {

        }
        else if(choice == 3)
        {

        }
    }
    public static void rightTriangle()
    {

    }
    public static void solvePerimeter()
    {

    }
    public static void solveArea()
    {

    }
}
