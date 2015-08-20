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
        System.out.println(checkBrackets("abc, {}, [a()]"));
    }

    public static boolean checkBrackets(String expression) {
        char[] inputChars = expression.toCharArray();
        char[] stack = new char[expression.length()];
        int stackHead = -1;
        for (int i = 0; i < expression.length(); i++) {
            if (isOpenBracket(inputChars[i])) {
                stackHead++;
                stack[stackHead] = inputChars[i];
            } else if (isClosedBracket(inputChars[i])) {
                if (stackHead < 0) {
                    return false;
                } else if (isPairBrackets(stack[stackHead],inputChars[i])) {
                    stackHead--;
                } else return false;
            }
        }

        return (stackHead == -1);
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

    public static boolean isPairBrackets(char bracket1, char bracket2) {
        if ((bracket1=='(' && bracket2==')')||
        (bracket1=='[' && bracket2==']')||
                (bracket1=='{' && bracket2=='}')){
            return true;
        }else return false;
    }
}
