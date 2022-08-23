package Stack;
import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> stack;
    private int top;

    public ArrayListStack(int capacity){
        top = 0;
        stack = new ArrayList<>(capacity);
    }


    public void push(int val){
        stack.add(val);
        top += 1;
    }

    public int pop(){;
        int a = stack.remove(top - 1);
        top -= 1;
        return a;
    }

    public int peek(){
        return stack.get(top - 1);
    }

    public void printStack(){
        for(int i = top - 1; i >= 0;i--){
            System.out.println(stack.get(i));
        }
    }
}
