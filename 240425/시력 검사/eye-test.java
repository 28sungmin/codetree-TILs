import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double leye, reye;
        leye = sc.nextDouble();
        reye = sc.nextDouble();

        if (leye >= 1.0 && reye >= 1.0)
            System.out.println("High");
        else if (leye >= 0.5 && reye >= 0.5)
            System.out.println("Middle");
        else 
            System.out.println("Low");
    }
}