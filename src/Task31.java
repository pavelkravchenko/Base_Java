/**
 * 31.	���� ����� ����� N (> 0). ����� ������������ N! = 1�2���N (N����������).
 * ����� �������� �������������� ������������, ��������� ��� ������������ � ������� ������������
 * ���������� � ������� ��� ��� ������������ �����.
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