package java8;

//Implement multiple inheritance with default method inside interface.

interface firstInterface {
    default void display() {
        System.out.println("Displaying from the inside of the first interface.");
    }
    default void story() {
        System.out.println("Story of first interface.");
    }
}

interface secondInterface {
    default void click() {
        System.out.println("Clicking from the inside of the second interface.");
    }
    default void story() {
        System.out.println("Story of second interface.");
    }
}

public class q5 implements firstInterface, secondInterface {

    //If we don't override the same method's with same signatures then compiler will throw error why?
    //because it doesn't know which story method to call.
    @Override
    public void story() {
        System.out.println("Story of a multiple inheritance waali class.");
    }
    public static void main(String[] args) {
        q5 obj = new q5();
        obj.display();
        obj.click();
        obj.story();
    }
}