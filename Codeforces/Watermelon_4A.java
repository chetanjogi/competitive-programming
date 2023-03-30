import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // If n is even they can divide except for number 2.
        String out = (n % 2 == 0  && n != 2) ? "YES" : "NO";
        System.out.println(out);
    }
}
