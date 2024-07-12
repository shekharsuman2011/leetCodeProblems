package problemsSolution;

import java.util.Stack;

//test cases
//        System.out.println(reverseParentheses("(abcd)")); // Output: "dcba"
//        System.out.println(reverseParentheses("(u(love)i)")); // Output: "iloveu"
//        System.out.println(reverseParentheses("(ed(et(oc))el)")); // Output: "leetcode"

public class problemNo1190 {
    public  static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // remove the '('
                }
                for (char reversedCh : sb.toString().toCharArray()) {
                    stack.push(reversedCh);
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}
