package collections;

//Employee class with custom sort method and comparator.

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private double age;
    private double salary;
    private String firstName;
    private String lastName;

    public Employee (double age, double salary, String firstName, String lastName) {
        super();
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    @Override
    public String toString() {
        return firstName+" "+lastName+" is "+age+" years old and have a salary of "+salary;
    }
}