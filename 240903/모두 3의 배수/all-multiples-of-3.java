import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (a % 3 == 0 && b % 3 == 0 && c % 3 == 0 && d % 3 == 0 && e % 3 == 0) {
            System.out.print(1);
        }
        else
            System.out.print(0);
    }
}