/**
 * 15.	���� ����� ������������� �����. ��������� ���������� ������������: ������� ����� �������� �������� �����������.
 */

public class Task15 {
    public static void main(String[] arrg) {
        System.out.println(sThreeDigitAndOdd(891));
    }

    public static boolean sThreeDigitAndOdd(int value) {
        return (value > 99 && value < 1000 && value % 2 != 0);
    }
}