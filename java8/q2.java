package java8;

/*
* Using (instance) Method reference, create and apply, add and subtract method and
* using (Static) Method reference, create and apply multiplication method for the functional interface created.
*/

import java.util.Scanner;

@FunctionalInterface
interface actionInterface {
    int action(int a, int b);
}

public class q2 {
    static int multiply(int a, int b) {
        return a*b;
    }
    int addition(int a, int b) {
        return a+b;
    }
    int subtraction(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        actionInterface mulVariable = q2::multiply;
        System.out.println("Multiplication using static method reference: "+mulVariable.action(num1, num2));
        actionInterface addVariable = new q2()::addition;
        System.out.println("Addition using instance method reference: "+addVariable.action(num1, num2));
        actionInterface subVariable = new q2()::subtraction;
        System.out.println("Subtraction using instance method reference: "+subVariable.action(num1, num2));
        sc.close();
    }
}