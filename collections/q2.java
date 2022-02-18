package collections;

/*
* Given the following class
* Employee class {Double Age, Double Salary, String Name}
* Design the class in such a way that the default sorting should work on firstname and lastname.
* Also, Write a program to sort Employee objects based on salary using Comparator.
*/

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(22, 20000, "John", "Jacobs"));
        employeeList.add(new Employee(23, 10000, "Narad", "Singh"));
        employeeList.add(new Employee(21, 30000, "Ish", "Bruh"));
        employeeList.add(new Employee(20, 40000, "Bhav", "Nagar"));
        employeeList.add(new Employee(25, 25000, "Ash", "James"));

        System.out.println("Before sorting on the firstName basis: ");
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
        Collections.sort(employeeList);

        System.out.println("\nAfter sorting on the firstName basis: ");
        employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }

        Collections.sort(employeeList, Employee.salaryComparator);
        System.out.println("\nAlso sorting on the basis of salary using Comparator: ");
        employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
    }
}