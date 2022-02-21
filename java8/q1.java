package java8;

//Write the following a functional interface and implement it using lambda:

import java.util.Scanner;

//First number is greater than second number or not             Parameter (int ,int ) Return boolean
@FunctionalInterface
interface compareInterface {
    boolean compare(int a, int b);
}

//Increment the number by 1 and return incremented value    Parameter (int) Return int
@FunctionalInterface
interface increment {
    int incrementByOne(int n);
}

//Concatenation of 2 string                 Parameter (String , String ) Return (String)
@FunctionalInterface
interface concat {
    String concatString(String a, String b);
}

//Convert a string to uppercase and return                      Parameter (String) Return (String)
@FunctionalInterface
interface uppercase {
    String convert(String a);
}

public class q1 {
    public static void main(String[] args) {
        compareInterface test = (a, b) -> a>b;
        Scanner sc = new Scanner(System.in);

        //Part 1
        System.out.println("Enter two number you want to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+" is greater than "+num2+" : "+test.compare(num1, num2));

        //Part 2
        increment obj = (n) -> n+1;
        System.out.println("Enter the number to be incremented: ");
        int c = sc.nextInt();
        System.out.println("After incrementing the number by one: "+obj.incrementByOne(c));

        //Part 3
        concat obj3 = (a, b) -> a+b;
        System.out.println("Enter two strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("After concatenating them: "+obj3.concatString(str1, str2));

        //Part 4
        uppercase o = (s) -> s.toUpperCase();
        System.out.println("Enter the string to be converted to uppercase: ");
        String str3 = sc.nextLine();
        System.out.println("After converting it to uppercase: "+o.convert(str3));
        sc.close();
    }
}