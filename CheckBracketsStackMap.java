package src;

import java.util.*;

/**
 * Created by kravchpa on 8/20/2015.
 */
public class CheckBracketsStackMap {

    public static void main(String[] args) {
        System.out.println(isValidBrackets("(){}[]", "abc, {}, [a()]"));
    }

    public static boolean isValidBrackets(String brackets, String input) {

        Map mapBrackets = new HashMap();
        for (int i = 0; i < brackets.length(); i = i + 2) {
            mapBrackets.put(brackets.charAt(i + 1), brackets.charAt(i));
        }
        Stack stack = new Stack();
        for (char bracket : input.toCharArray()) {
            if (mapBrackets.containsValue(bracket)) {
                stack.push(bracket);
            } else if (mapBrackets.containsKey(bracket)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (mapBrackets.get(bracket) == stack.peek()) {
                    stack.pop();
                } else return false;
            }
        }

        return (stack.isEmpty());
    }
}

