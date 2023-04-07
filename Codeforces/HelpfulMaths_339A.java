import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths_339A {
    public static void main(String[] args) {
        args = new Scanner(System.in).next().split("\\+");
        Arrays.sort(args);
        String s = String.join("+",args);
        System.out.println(s);
    }
}
