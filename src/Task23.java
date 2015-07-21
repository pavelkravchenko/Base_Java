/**
 * 23.	������ ��������� ���� ��������� ���������� ������: 1 � ����, 2 � �����, 3 � �����, 4 � �����.
 * ����������� ����, ������� �������, ��������� ������: 11 � �����, 12 � ����, 13 � ������, 14 � ���.
 * ���� ��� ����� �����: N � ����������� (6 < N < 14) � M � ����� ����� (1 < M < 4).
 * ������� �������� ��������������� ����� ���� ��������� �����, ����� ������, ���� ����� � �. �.
 */
public class Task23 {
    public static void main(String[] arrgs) {
        getCardDesc(6, 4);
    }

    public static void getCardDesc(int n, int m) {
        String rank;
        switch (n) {
            case 6:
                rank = "��������";
                break;
            case 7:
                rank = "�������";
                break;
            case 8:
                rank = "���������";
                break;
            case 9:
                rank = "�������";
                break;
            case 10:
                rank = "�������";
                break;
            case 11:
                rank = "�����";
                break;
            case 12:
                rank = "����";
                break;
            case 13:
                rank = "������";
                break;
            case 14:
                rank = "���";
                break;
            default:
                rank = "������������ ����";
        }
        String suit;
        switch (m) {
            case 1:
                suit = "����";
                break;
            case 2:
                suit = "�����";
                break;
            case 3:
                suit = "�����";
                break;
            case 4:
                suit = "�����";
                break;
            default:
                suit = "�������";
        }
        System.out.println(rank + " " + suit);
    }
}