/**
 * 35.	Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей,
 * кроме 1 и самого себя, то вывести True, иначе вывести False.
 */
public class Task35 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(49));
    }

    public static boolean isPrimeNumber(int n) {
       if (n<=1) {
           return false;
       }
        for(int i=2; i<n; i++){
           if ( n%i==0){
               return false;
           }
       }return true;
    }
}



