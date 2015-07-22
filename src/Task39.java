/**
 * 39.	Дан массив из десяти целых чисел. Найти их произведение.
 */
public class Task39 {
    public static void main(String[] args) {
        getProductElem(new int[]{1, 2, 1, 5, 1, 1, 1, 1, 10, 2});
    }

    public static void getProductElem(int[] anArray) {
        int prod = 1;
        for (int i = 0; i <= 9; i++) {
            prod *= anArray[i];
        }
        System.out.println(prod);
    }
}
