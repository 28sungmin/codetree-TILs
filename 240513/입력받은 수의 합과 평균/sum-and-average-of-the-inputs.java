import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumVal = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sumVal += x;
        }

        double avg = (double)sumVal / n;
        System.out.printf("%d %.1f", sumVal, avg);
    }
}