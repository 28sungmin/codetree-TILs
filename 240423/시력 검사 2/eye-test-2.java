import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double eye_ave = sc.nextDouble();

        if (eye_ave >= 1.0)
            System.out.println("High");
        else if (eye_ave >= 0.5)
            System.out.println("Middle");
        else 
            System.out.println("Low");
    }
}