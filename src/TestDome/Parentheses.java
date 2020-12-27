package TestDome;


import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) {

        String text = "((()())(()))";

        char[] charArray = text.toCharArray();

        Stack<Character> stackOpen = new Stack<Character>();
        //Open
        for (int i = 0; i < charArray.length; i++) {
            stackOpen.push(charArray[i]);
        }

        Stack<Character> stackClose = new Stack<Character>();
        boolean isValid = true;
        //Close
        while (!stackOpen.isEmpty()) {

            char c = stackOpen.pop();

            if (c == ')') {
                stackClose.push(c);
            } else {
                if (stackClose.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    stackClose.pop();
                }
            }
        }

        if (isValid) {
            System.out.println("Matched");
        } else {
            System.out.println("Not Matched");
        }

    }

}
