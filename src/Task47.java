/**
 * 47.	Дан массив из N целых чисел. Найти их сумму. Расчет суммы массива реализовать в виде функции.
 */
public class Task47 {
    public static void main(String[] args) {
        getSumElem(new int[]{1, 2, 1, 5, 1, 1, 1, 1, 10, 12, 3, 4, 4, 5, 6, 7, 78, 5});
    }

    public static void getSumElem(int[] anArray) {
        int sum = 0;
        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
        }
        System.out.println(sum);
    }
}
