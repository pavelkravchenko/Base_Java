/**
* Task3.	Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C, C — в B, B — в A, и вывести новые значения переменных A, B, C.
*/
public class Task3 {
    public static void main(String[] arr) {
        replace1(12, 13, 14);
        replace(12,13,14);

    }

    //ìåòîä äëÿ èçìåíåíèÿ çíà÷åíèé ïåðåìåííûõ ñ èñïîëüçîâàíèåì äîïîëíèòåëüíîé ïåðåìåííîé
    static void replace(int A, int B, int C) {
        int temp = 0;
        temp = A;
        A = C;
        C = B;
        B = temp;
        System.out.println(A + "  " + B + "   " + C);

    }
    //ìåòîä äëÿ èçìåíåíèÿ çíà÷åíèé ïåðåìåííûõ ñ èñïîëüçîâàíèåì ñóììû âñåõ ïåðåìåííûõ
    static void replace1(int a, int b, int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a+"  "+b+"   "+c);
    }
}
