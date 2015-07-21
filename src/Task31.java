/**
 * 31.	Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал).
 * Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью вещественной
 * переменной и вывести его как вещественное число.
 */
public class Task31 {
    public static void main(String[] arrgs) {
        System.out.println(factorialRec(9));
    }

    public static double factorialRec(double valueFactR) {
        if (valueFactR <= 0) return 1;
        return valueFactR *= factorialRec(--valueFactR);
    }
}