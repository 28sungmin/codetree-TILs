import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a_c, b_c, c_c;
        int a_t, b_t, c_t;

        a_c = sc.next().charAt(0);
        a_t = sc.nextInt();

        b_c = sc.next().charAt(0);
        b_t = sc.nextInt();

        c_c = sc.next().charAt(0);
        c_t = sc.nextInt();


        if (a_c == 'Y' && a_t >= 37) {
            if (b_c == 'Y' && b_t >= 37 || c_c == 'Y' && c_t >= 37)
                System.out.println('E');
            else 
                System.out.println('N');
        }
        else {
            if ((b_c == 'Y' && b_t >= 37) && (c_c == 'Y' && c_t >= 37))
                System.out.println('E');
            else 
                System.out.println('N');
        }

    }
}