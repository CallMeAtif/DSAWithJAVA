package Stack;

public class ArrayListStack_Main {

    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack(10);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("Peeking");
        System.out.println(stack.peek());
        System.out.println("Popping the element");
        System.out.println(stack.pop());
        System.out.println("Peeking after popping");
        System.out.println(stack.peek());

        System.out.println("Printing Stack");
        stack.printStack();
    }
}
