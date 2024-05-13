import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, sumVal = 0, cnt = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal+=i;
                cnt++;
            }
        }
        
        double ave = (double)sumVal / cnt;

        System.out.printf("%d %.1f", sumVal, ave);
    }
}