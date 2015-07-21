/**
 * 23.	ћаст€м игральных карт присвоены пор€дковые номера: 1 Ч пики, 2 Ч трефы, 3 Ч бубны, 4 Ч червы.
 * ƒостоинству карт, старших дес€тки, присвоены номера: 11 Ч валет, 12 Ч дама, 13 Ч король, 14 Ч туз.
 * ƒаны два целых числа: N Ч достоинство (6 < N < 14) и M Ч масть карты (1 < M < 4).
 * ¬ывести название соответствующей карты вида Ђшестерка бубенї, Ђдама червейї, Ђтуз трефї и т. п.
 */
public class Task23 {
    public static void main(String[] arrgs) {
        getCardDesc(6, 4);
    }

    public static void getCardDesc(int n, int m) {
        String rank;
        switch (n) {
            case 6:
                rank = "шестерка";
                break;
            case 7:
                rank = "семерка";
                break;
            case 8:
                rank = "восьмерка";
                break;
            case 9:
                rank = "дев€тка";
                break;
            case 10:
                rank = "дес€тка";
                break;
            case 11:
                rank = "валет";
                break;
            case 12:
                rank = "дама";
                break;
            case 13:
                rank = "король";
                break;
            case 14:
                rank = "туз";
                break;
            default:
                rank = "неправильный ввод";
        }
        String suit;
        switch (m) {
            case 1:
                suit = "пики";
                break;
            case 2:
                suit = "трефы";
                break;
            case 3:
                suit = "бубны";
                break;
            case 4:
                suit = "червы";
                break;
            default:
                suit = "неверно";
        }
        System.out.println(rank + " " + suit);
    }
}