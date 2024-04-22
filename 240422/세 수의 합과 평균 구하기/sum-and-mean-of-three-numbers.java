import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, c, total, ave;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        total = a + b + c;
        ave = total / 3;

        System.out.println(total);
        System.out.print(ave);
    }
}