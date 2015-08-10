import java.util.Arrays;
/**
 * 43.	Дано вещественное число B, целое число N и массив из N целых чисел, упорядоченных по возрастанию.
 * Вывести элементы массива вместе с числом B, сохраняя упорядоченность выводимых чисел.
 */
public class Task43 {
    public static void main(String[] args) {
        sortArray(123, new int[]{45, 7, 4, 9, 0, 5});
    }

    public static void sortArray(double b, int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println(b + "  " + Arrays.toString(array));
    }
}
