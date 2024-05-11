import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int rst = a / b;
        System.out.printf("%d.", rst);
        
        int num = a % b;
        for (int i = 1; i <= 20; i++) {
            num *= 10;
            rst = num / b;
            num = num % b;
            System.out.printf("%d", rst);
        }
    }
}