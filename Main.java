import java.util.Stack;

import problemsSolution.problemNo1190;

import static problemsSolution.problemNo1190.reverseParentheses;

public class Main {
    public static void main(String[] args) {
//        problemNo1190 1190 =new problemNo1190();
        System.out.println(reverseParentheses("(abcd)")); // Output: "dcba"
        System.out.println(reverseParentheses("(u(love)i)")); // Output: "iloveu"
        System.out.println(reverseParentheses("(ed(et(oc))el)")); // Output: "leetcode"
    }


}