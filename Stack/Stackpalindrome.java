package Stack;

import java.util.LinkedList;

public class Stackpalindrome {

    public static boolean isPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Atif"));
        System.out.println(isPalindrome("ababa"));
        System.out.println(isPalindrome("I did,did I?"));
        System.out.println(isPalindrome("Was it a car or a cat i saw?"));
    }
}
