import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rst = 1, i;
        while(true) {
            for(i = 0; i <= 10; i++) {
                rst = rst * 2;
                if (rst == n) {
                    break;
                }
            }
            break;
        }
        System.out.print(i + 1);
    }
}