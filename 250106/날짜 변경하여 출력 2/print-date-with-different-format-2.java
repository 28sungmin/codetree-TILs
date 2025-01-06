import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useDelimiter("-");

        int m = scan.nextInt();
        int d = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(y + "." + m + "." + d);
    }
}