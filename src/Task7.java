/**Task7.	���� �������� ����������� T � �������� �������. ���������� �������� ���� �� ����������� � �������� ����������.
 ����������� �� ������� TC � ����������� �� ���������� TF ������� ��������� ������������: TC=(TF�32)�5/9.
 ���� ����������� ������������ ����� ��������� ��������� ������.
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