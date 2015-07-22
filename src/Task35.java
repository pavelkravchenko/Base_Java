 * 35.	Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей,
 * кроме 1 и самого себя, то вывести True, иначе вывести False.
 */
public class Task35 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
    }

    public static boolean isPrimeNumber(int n) {
        if ((n <= 1) || (n % 2 == 0 && n != 2) || (n % 3 == 0 && n != 3) || (n % 5 == 0 && n != 5)) {
            return false;
        }
        return true;
    }
}
