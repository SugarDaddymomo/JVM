package collections;

//Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value.

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Map<EmployeeQ, Integer> employeeQIntegerMap = new HashMap<>();
        EmployeeQ emp1 = new EmployeeQ("Rajesh", 25, "Trainee");
        EmployeeQ emp2 = new EmployeeQ("John", 30, "Tech Lead");
        EmployeeQ emp3 = new EmployeeQ("Ramesh", 28, "Associate Solution Engineer");
        EmployeeQ emp4 = new EmployeeQ("Ashley", 34, "Manager");

        employeeQIntegerMap.put(emp1, 25000);
        employeeQIntegerMap.put(emp2, 30000);
        employeeQIntegerMap.put(emp3, 35000);
        employeeQIntegerMap.put(emp4, 40000);

        System.out.println(emp1+" and their salary is: INR"+employeeQIntegerMap.get(emp1));
        System.out.println(emp2+" and their salary is: INR"+employeeQIntegerMap.get(emp2));
        System.out.println(emp3+" and their salary is: INR"+employeeQIntegerMap.get(emp3));
        System.out.println(emp4+" and their salary is: INR"+employeeQIntegerMap.get(emp4));
    }
}