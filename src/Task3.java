/**
* Task3.	Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C, C — в B, B — в A, и вывести новые значения переменных A, B, C.
*/
public class Task3 {
    public static void main(String[] arr) {
        replace1(12, 13, 14);
        replace(12,13,14);

    }

    //метод для изменения значений переменных с использованием дополнительной переменной
    static void replace(int A, int B, int C) {
        int temp = A;
        A = C;
        C = B;
        B = temp;
        System.out.println(A + "  " + B + "   " + C);

    }
    //метод для изменения значений переменных с использованием суммы всех переменных
    static void replace1(int a, int b, int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a+"  "+b+"   "+c);
    }
}
