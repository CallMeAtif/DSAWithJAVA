package Stack;

public class Main_for_SinglyLL_Stack {
    public static void main(String[] args) {
        Employee atifMulla = new Employee("Atiful", "Mulla", 123);
        Employee parvezMulla = new Employee("Parvez", "Mulla",456);
        Employee armanBhakshey = new Employee("Arman", "Bhakshey", 789);


        Stack_for_SinglyLL stack = new Stack_for_SinglyLL();

        //pushing
        stack.push(atifMulla);
        stack.push(parvezMulla);
        stack.push(armanBhakshey);

//        System.out.println(stack.peek());

        //poping
//        System.out.println(stack.pop());

        //peek
//        System.out.println(stack.peek());

        //printing
        stack.printStack();
    }
}
