package stackandqueue;

import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (Character ch : s.toCharArray()) {
            if (ch.equals('(')) {
                stack.push(')');
            }else if (ch.equals('[')) {
                stack.push(']');
            }else if (ch.equals('{')) {
                stack.push('}');
            }else{
                if (stack.isEmpty() || !(stack.pop().equals(ch))) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("([)]"));
    }
}
