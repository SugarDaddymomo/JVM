package introjava1;

//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

public class q1 {
    static {
        System.out.println("In static block");
        System.out.println("Ashutosh Yadav 24");
    }

    static String firstName = "Ashutosh";
    static String lastName = "Yadav";
    static int age = 24;

    private static void print() {
        System.out.println("In static method");
        System.out.println("Ashutosh Yadav 24");
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        System.out.println(firstName+" "+lastName+" "+age);
        print();
    }
}