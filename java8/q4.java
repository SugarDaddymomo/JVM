package java8;

/*
* WAP using java 8:
* Collect all even numbers from a list using stream
* Given a list of objects of following class:-
* class Employee {
*   String fullName;
*   Long salary;
*   String city;
* }
* Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
* Note: Full name is concatenation of first name, middle name and last name with single space in between.
*/

import java.util.*;
import java.util.stream.*;

class Employee {
    private String fullName;
    private long salary;
    private String city;

    Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
    public String getFullName() {
        return fullName;
    }
    public String getFirstName() {
        String[] arr = fullName.split(" ", 2);
        String res = arr[0];
        return res;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

public class q4 {
    public static void main(String[] args) {
        //List for holding numbers.
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //List for collecting and holding even numbers from above number list.
        List<Integer> evenNumberList = numList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //List for holding Employee class objects.
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Ramesh Kumar Thakur", 45000, "Etawah"));
        employeeList.add(new Employee("Ashish Kumar Singh", 40000, "Noida"));
        employeeList.add(new Employee("Bablu Kumar Rathor", 35000, "Dadri"));
        employeeList.add(new Employee("Bablu Kumar Thakur", 30000, "Bihar"));
        employeeList.add(new Employee("Lokesh Singh Lovely", 25000, "London"));
        employeeList.add(new Employee("Kumar Bhupesh Singh", 3000, "Lucknow"));
        employeeList.add(new Employee("Lokesh Kumar Bhaw", 4000, "Delhi"));
        employeeList.add(new Employee("Sneha Kumari Thakur", 2000, "Delhi"));
        employeeList.add(new Employee("Sneha Kumari Singh", 1500, "Delhi"));
        employeeList.add(new Employee("Zayed Shah Khan", 3500, "Muzaffarnagar"));


        List<String> result = employeeList.stream().filter(a -> a.getCity().equals("Delhi")).filter(q -> q.getSalary()<5000).map(h -> h.getFirstName()).collect(Collectors.toList());
        List<String> listDistinct = result.stream().distinct().collect(Collectors.toList());
        String collectDistinct = listDistinct.stream().collect(Collectors.joining(" "));
        System.out.println("Below are the employees with unique firstNames who have less salary than 5000 and lives in Delhi: ");
        System.out.println(collectDistinct);
    }
}