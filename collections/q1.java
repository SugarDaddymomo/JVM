package collections;

//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<Float>(5);
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            floatList.add(sc.nextFloat());
        }
        Iterator<Float> floatIterator = floatList.iterator();
        while (floatIterator.hasNext()) {
            sum += floatIterator.next();
        }
        System.out.println("Sum of entered 5 float numbers is: "+sum);
        sc.close();
    }
}