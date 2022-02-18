package collections;

/*
* Design a Data Structure SpecialStack that supports all the stack operations
* like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
* which should return minimum element from the SpecialStack. (Expected complexity O(1))
*/

public class q3 {
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(3);
        specialStack.push(5);
        specialStack.getMin();
        specialStack.push(2);
        specialStack.push(1);
        specialStack.getMin();
        specialStack.pop();
        specialStack.getMin();
        specialStack.pop();
        specialStack.peek();
    }
}