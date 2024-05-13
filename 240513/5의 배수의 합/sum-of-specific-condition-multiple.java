import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b, sumVal = 0, big, small;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a >= b) {
            big = a;
            small = b;
        }
        else {
            big = b;
            small = a;
        }

        for (int i = small; i <= big; i++) {
            if (i % 5 == 0) sumVal += i;
        }
        System.out.print(sumVal);

    }
}