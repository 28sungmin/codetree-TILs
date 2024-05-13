import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, sumVal = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        int x = (a >= b ? a : b); // 큰 수 
        int y = (a < b ? b : a);  // 작은 수 

        for (int i = y; i <= x; i++) {
            if (i % 5 == 0) sumVal += i;
        }

        System.out.print(sumVal);

    }
}