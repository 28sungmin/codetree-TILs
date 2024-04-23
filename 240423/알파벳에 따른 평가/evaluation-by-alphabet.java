import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char word = sc.next().charAt(0);

        if (word == 'S')
            System.out.println("Superior");
        else if (word == 'A')
            System.out.println("Excellent");
        else if (word == 'B')
            System.out.println("Good");    
        else if (word == 'C')
            System.out.println("Usually");
        else if (word == 'D')
            System.out.println("Effort");
        else 
            System.out.println("Failure");
    }
}