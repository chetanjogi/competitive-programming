import java.util.Scanner;

public class Stones_On_The_Table_266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
