package Stack;

import Employee.Employee;
public class Stack_for_SinglyLL {
    private SinglyLL stack;
    private int top;

    public Stack_for_SinglyLL(){
        stack = new SinglyLL();
    }

    public void push(Employee employee){
        stack.push(employee);

        top += 1;
    }

    public Employee pop(){
        top -= 1;
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public int size(){
        return top;
    }

    public void printStack(){
        stack.printLL();
    }
}
