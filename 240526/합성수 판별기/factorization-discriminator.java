import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean okay = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                okay = true;
                break;
            }
        }

        if (okay == true) 
            System.out.print('C');
        else
            System.out.print('N');
    }
}