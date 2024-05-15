import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(n1 * n2);

            if (c == 'C') break;

        }
    }
}