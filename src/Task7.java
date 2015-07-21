/** 7.	Дано значение температуры T в градусах Цельсия. Определить значение этой же температуры в градусах Фаренгейта.
 *  Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: TC=(TF–32)·5/9.
 *  Ввод температуры организовать через параметры командной строки.
 */

import java.util.Scanner;
public class Task7 {
    public static void main(String[] arr) {
        Scanner TC = new Scanner(System.in);
        System.out.print("Enter value of Temperature C: ");
        int tc = TC.nextInt();
//        System.out.println("You entered: " + tc);
        int tf = (tc - 32) * 5 / 9;
        System.out.println("Temperature F is:   "+tf);
    }
}
