package collections;

//Employee class for question four.

public class EmployeeQ {
    String name;
    int age;
    String designation;

    EmployeeQ(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return name+" is "+age+" years old and he is a "+designation+" in our organization.";
    }
}