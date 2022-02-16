package introjava1;

/*
* Create a two-dimensional array of integers and display:
* sum of all elements of each column
* sum of all elements of each row
*/

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size for your 2d array: ");
        int row = sc.nextInt();
        System.out.println("Enter column size for your 2d array: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int sumOfRow, sumOfCol;


        System.out.println("Input your array: ");
        //Taking input into our 2d array.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("This is your entered 2d array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Calculating sum of all elements of each column.
        for (int i = 0; i < col; i++) {
            sumOfCol = 0;
            for (int j = 0; j < row; j++) {
                sumOfCol = sumOfCol + arr[j][i];
            }
            System.out.println("Sum of "+(i+1)+" column is: "+sumOfCol);
        }

        //Calculating sum of all elements of each row.
        for (int i = 0; i < row; i++) {
            sumOfRow = 0;
            for (int j = 0; j < col; j++) {
                sumOfRow = sumOfRow + arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is: "+sumOfRow);
        }
        sc.close();
    }
}