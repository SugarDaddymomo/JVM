package collections;

//SpecialStack class having all methods and one special method as getMin().

import java.util.Stack;

public class SpecialStack {
    Stack<Integer> integerStack;
    Integer minElement;

    SpecialStack () {
        integerStack = new Stack<Integer>();
    }

    void getMin() {
        if (integerStack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Minimum element in the stack is: "+minElement);
        }
    }

    void peek() {
        if (integerStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Integer top = integerStack.peek();
        System.out.println("Top element is: ");
        if (top < minElement) {
            System.out.println(minElement);
        } else {
            System.out.println(top);
        }
    }

    void pop() {
        if (integerStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element removed: ");
        Integer top = integerStack.pop();
        if (top < minElement) {
            System.out.println(minElement);
            minElement = 2*minElement-top;
        } else {
            System.out.println(top);
        }
    }


    void push(Integer item) {
        if (integerStack.isEmpty()) {
            minElement = item;
            integerStack.push(item);
            System.out.println("Item inserted: "+item);
            return;
        }
        if (item < minElement) {
            integerStack.push(2*item - minElement);
            minElement = item;
        } else {
            integerStack.push(item);
        }
        System.out.println("Item inserted: "+item);
    }
}