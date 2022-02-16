package introjava1;

//Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";
        do {
            word = sc.next();
            System.out.println(word);
        } while (!word.equalsIgnoreCase("XDONE"));
        sc.close();
    }
}