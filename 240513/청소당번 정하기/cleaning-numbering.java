import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt_2 = 0, cnt_3 = 0, cnt_12 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) cnt_3++;
                else if (i % 12 == 0) cnt_12++;
                else cnt_2++;
            }
            else if (i % 3 == 0) {
                if (i % 12 == 0) cnt_12++;
                else cnt_3++;
            }
            else if (i % 12 == 0) cnt_12++;
        }
        System.out.printf("%d %d %d", cnt_2, cnt_3, cnt_12);
    }
}