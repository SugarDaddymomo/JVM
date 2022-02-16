package introjava1;

/*
* Write a java program to show following menu to the user:
* *******Menu*******
* 1. Calculate Area of Circle
* 2. Calculate Circumference of a Circle
* 3. Exit.
* Choose an option (1-3):
*/

import java.util.Scanner;

public class q3 {
    static double area (double radius) {
        return Math.PI*Math.pow(radius, 2.0);
    }
    static double circumference (double radius) {
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.println("*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.println("Choose an option (1-3):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the radius for area to be calculated: ");
                radius = sc.nextDouble();
                System.out.println("Area of the Circle is: "+area(radius));
                break;

            case 2:
                System.out.println("Enter the radius for circumference to be calculated: ");
                radius = sc.nextDouble();
                System.out.println("Circumference of the Circle is: "+circumference(radius));
                break;

            case 3:
                System.out.println("Exiting from Menu!!!");
                break;
        }
        sc.close();
    }
}