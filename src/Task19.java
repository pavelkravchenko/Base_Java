/**
 * 19.	Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8).
 * Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
 */

public class Task19 {
    public static void main(String[] args) {
        System.out.println(isValidRookMove(1, 1, 8, 1));
    }

    public static boolean isValidRookMove(int x1, int y1, int x2, int y2) {
        int moveX = x2 - x1;
        int moveY = y2 - y1;
        System.out.println("Previous position (" + x1 + ", " + y1 + ")\n" + "Actual position (" + x2 + ", " + y2 + ")");
     /*   if ( (moveX ==0 || moveY == 0) && x1>=1 && x1<=8 && y1>=1 && y1<=8 && x2>=1 && x2<=8 && y2>=1 && y2<=8){
            return true;
        }return false;*/
        return ((moveX == 0 || moveY == 0) && x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8 && x2 >= 1 && x2 <= 8 && y2 >= 1 && y2 <= 8);
    }
}
