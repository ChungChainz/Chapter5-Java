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
        System.out.println("What are you solving for? \n1 - for right triangles \n" +
                "2 - for isosceles \n3- for equilateral \nChoice >>>");
        choice = input.nextInt();

        if (choice == 1)
        {
            rightTriangle();
        }
        else if (choice == 2)
        {
            isoscelesTriangle();
        }
        else if(choice == 3)
        {
            equilateralTriangle();
        }
    }
    public static void rightTriangle() {
        Scanner input = new Scanner(System.in);
        String choice;
        String firstChoice;
        double side1;
        double side2;
        System.out.print("Are you solving for a side or the perimeter?\n" +
                "A- Perimeter\nB- Missing Side");
        firstChoice = input.next();
        if (firstChoice.equalsIgnoreCase("A")) {
            solvePerimeter();
        }
        else {

            System.out.print("Which side do you want to solve for?\n" +
                    "A- Side\nB- Side\nC- Side");
            choice = input.next();

            if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")) {
                System.out.print("Please enter the other smaller side >>>");
                side1 = input.nextDouble();
                System.out.print("Please enter for side C >>>");
                side2 = input.nextDouble();
                rightTriangleMathAB(side1, side2, choice);
            } else {
                System.out.print("Please enter for side A >>>");
                side1 = input.nextDouble();
                System.out.print("Please enter for side B >>>");
                side2 = input.nextDouble();
                rightTriangleMathC(side1, side2, choice);
            }
        }
    }
    public static void isoscelesTriangle()
    {
        Scanner input = new Scanner(System.in);
        String firstChoice;
        System.out.print("Are you solving for a side or the perimeter?\n" +
                "A- Perimeter\nB- Missing Side");
        firstChoice = input.next();
        if (firstChoice.equalsIgnoreCase("A"))
        {
            solvePerimeter();
        }
        else {
            isoscelesHeight();
        }
    }
    public static void equilateralTriangle()
    {
        Scanner input = new Scanner(System.in);
        String firstChoice;
        System.out.print("Are you solving for a side or the perimeter?\n" +
                "A- Perimeter\nB- Missing Side");
        firstChoice = input.next();
        if (firstChoice.equalsIgnoreCase("A"))
        {
            solvePerimeter();
        }
        else {
            equilateralHeight();
        }
    }
    public static void rightTriangleMathAB(double side1, double side2, String choice)
    {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);

    }
    public static void rightTriangleMathC(double side1, double side2, String choice)
    {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("The side " + choice + " is " + C);
    }
    public static void solvePerimeter()
    {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        double perimeter;

        System.out.print("Please enter for side A >>>");
        side1 = input.nextDouble();
        System.out.print("Please enter for side B >>>");
        side2 = input.nextDouble();
        System.out.print("Please enter for side C >>>");
        side3 = input.nextDouble();
        perimeter = side1 + side2 + side3;

        System.out.println("The perimeter for your triangle is " + perimeter);

    }
    public static void isoscelesHeight()
    {
        Scanner input = new Scanner(System.in);
        double area;
        double base;
        double height;
        System.out.print("Please enter the area of the triangle >>>");
        area = input.nextDouble();
        System.out.print("Please enter the value for the base of the triangle >>>");
        base = input.nextDouble();

        height = area / base * 2;

        System.out.println("The height for your triangle is " + height);

    }
    public static void equilateralHeight()
    {
        Scanner input = new Scanner(System.in);
        double side;
        double height;
        System.out.print("Please enter for one side of an equilateral triangle >>>");
        side = input.nextDouble();
        height = side / 2 * Math.sqrt(3);

        System.out.println("The height for your triangle is " + height);
    }
}
