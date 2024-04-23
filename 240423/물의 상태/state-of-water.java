import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt();
        String rst;

        if (temp < 0) 
            rst = "ice";
        else if (temp >= 100)
            rst = "vapor";
        else
            rst = "water";

        System.out.println(rst);    
    }
}