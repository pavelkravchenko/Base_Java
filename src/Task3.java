/*
Task3.	���� ���������� A, B, C. �������� �� ��������, ���������� ���������� A � C, C � � B, B � � A, � ������� ����� �������� ���������� A, B, C.
*/
public class Task3 {
    public static void main(String[] arr) {
        replace1(12, 13, 14);
        replace(12,13,14);

    }

    //����� ��� ��������� �������� ���������� � �������������� �������������� ����������
    static void replace(int A, int B, int C) {
        int temp = 0;
        temp = A;
        A = C;
        C = B;
        B = temp;
        System.out.println(A + "  " + B + "   " + C);

    }
    //����� ��� ��������� �������� ���������� � �������������� ����� ���� ����������
    static void replace1(int a, int b, int c){
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a+"  "+b+"   "+c);
    }
}