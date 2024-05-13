import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, sumVal = 0;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 1 && x % 3 == 0) sumVal+=x;
        }
        System.out.print(sumVal);
    }
}