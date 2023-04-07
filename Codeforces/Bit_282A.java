import java.util.Scanner;

public class Bit_282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int initialValue = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.contains("++")){
                initialValue++;
            }else initialValue--;
        }
        System.out.println(initialValue);
    }
}
