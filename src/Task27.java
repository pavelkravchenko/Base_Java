/**
 * 27.	Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно.
 */
public class Task27 {
    public static void main(String[] arrgs) {
        System.out.println(getSumInt(1, 5));
    }

    public static int getSumInt(int a, int b) {
        if (a >= b) {
            return 1;
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
