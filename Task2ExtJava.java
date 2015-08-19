/**
 * 2) Есть строка, которая может содержать любые символы, в том числе и скобки: {}, [], ()
 * Скобки могут быть вложенными.
 * Необходимо написать метод, который принимает строку и возвращает true, если расположение скобок
 * корректное.
 * <p>
 * Корректные строки: abc, {}, [a()]
 * Некорректные строки: a[, []))), ab[{]}
 * <p>
 * Для этого задания можно использовать только те знания, которые мы уже прошли.
 */

public class Task2ExtJava {
    public static void main(String[] args) {
        System.out.println(checkBrackets("[([456{}])]"));
    }

    public static boolean checkBrackets(String expression) {
        char[] chars = expression.toCharArray();
        char[] stack = new char[expression.length()];
        int curHead = -1;
        for (int i = 0; i < expression.length(); i++) {
            if (isOpenBracket(chars[i])) {
                curHead++;
                stack[curHead] = chars[i];
            } else if (isClosedBracket(chars[i])) {
                if (curHead < 0) {
                    return false;
                } else if (stack[curHead] == getOpenedBracket(chars[i])) {
                    //stack[curHead] = ' ';
                    curHead--;
                } else return false;
            }
        }

        if (curHead == -1) {
            return true;
        }
        return false;
    }


    public static boolean isOpenBracket(char bracket) {
        if (bracket == '(' || bracket == '{' || bracket == '[') {
            return true;
        }
        return false;
    }

    public static boolean isClosedBracket(char bracket) {
        if (bracket == ')' || bracket == '}' || bracket == ']') {
            return true;
        }
        return false;
    }

    /*public static char isPairBrackets(char bracket1, char bracket2) {
        if ((bracket1 == '(' && bracket2 == ')') ||
                (bracket1 == '[' && bracket2 == ']') ||
                (bracket1 == '{' && bracket2 == '}')) {
            return bracket2;
        } else return 0;
    }*/
    public static char getOpenedBracket(char bracket) {
        if (bracket == '}') {
            return '{';
        }
        if (bracket == ']') {
            return '[';
        }
        if (bracket == ')') {
            return '(';
        }  throw new RuntimeException("input value is not closed bracket");
    }
}
