public class GetNumTask {
    public static void main(String[] arrgs) {
        calcTaskNumb('K',56);

    }
    public static void calcTaskNumb(char fl, int numTask) {
        int a = fl % 4;
        for (int nt = 1; nt <= numTask; nt++) {
            if (nt % 4 == a) {
                System.out.println("Number of Task is  "+nt);

            }
        }
    }
}