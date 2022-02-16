package introjava1;

/*
* Create a class named Employee with fields firstname,lastname,age and designation.
The class should:
* have all types of constructors to initialize the object
* class should also have setter methods to update a particular field
* Override its toString method to display a meaningful message using all these fields.
*/

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    Employee () {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "";
    }

    Employee (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.designation = "";
    }

    Employee (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = "";
    }

    Employee (String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" is "+age+" years old and is working as "+designation+" in our organization.";
    }
}

public class q5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Second", "User");
        Employee emp3 = new Employee("Third", "User", 26);
        Employee emp4 = new Employee("Sharda", "Kumari", 23, "JVM Trainee");
        System.out.println("Empty parameter constructor:");
        System.out.println(emp1.toString());
        System.out.println("\nConstructor with 2 parameters: ");
        System.out.println(emp2.toString());
        System.out.println("\nConstructor with 3 parameters: ");
        System.out.println(emp3.toString());
        System.out.println("\nConstructor with all fields: ");
        System.out.println(emp4.toString());

        System.out.println("\nLet's set values for all fields for 1st employee and print: ");
        emp1.setFirstName("First");
        emp1.setLastName("User");
        emp1.setAge(25);
        emp1.setDesignation("Intern");
        System.out.println(emp1.toString());

        System.out.println("\nLet's set value for age and designation for 2nd employee and print: ");
        emp2.setAge(18);
        emp2.setDesignation("Intern");
        System.out.println(emp2.toString());

        System.out.println("\nLet's set value for designation for 3rd employee and print: ");
        emp3.setDesignation("Tester");
        System.out.println(emp3.toString());
    }
}