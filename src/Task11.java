/**
 * 10.	Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
 * 11.	Решить предыдущую задачу, не использую никаких дополнительных переменных.
 */
public class Task11 {
    public static void main(String[] arf) {
        System.out.println(revertDigits(71));
    }

    public static int revertDigits(int value) {
        if (value / 100 != 0 || value / 10 == 0) return 0;
        return ((value % 10) * 10) + (value / 10);
    }
}