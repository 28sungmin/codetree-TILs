import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, rst1, rst2;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b)
            rst1 = 1;
        else 
            rst1 = 0;
        
        if (a == b)
            rst2 = 1;
        else 
            rst2 = 0;

        System.out.printf("%d %d", rst1, rst2);
    }
}