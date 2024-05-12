import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n, shr, rem, i;
        n = sc.nextInt();


        i = 1;
        while (i <= n) {
            if (i < 10) {
                if (i % 3 == 0)
                    System.out.printf("%d ", 0);
                else 
                    System.out.printf("%d ", i);
            }
            else {
                shr = i / 10;
                rem = i % 10;
                if (i % 3 == 0 || shr % 3 == 0 || (rem % 3 == 0 && rem != 0))
                    System.out.printf("%d ", 0);
                else 
                    System.out.printf("%d ", i);
            }
            i++;
        }
    }
}