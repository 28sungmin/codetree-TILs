import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        boolean okay = false;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                okay = true;
                break;
            }
        }
        if (okay == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}