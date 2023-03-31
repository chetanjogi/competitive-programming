import java.util.Collections;
import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        while (n-->0){
            int count  = 0;
            int a = 3;
            while (a-->0){
                if (scanner.nextInt() == 1){
                    count++;
                }
            }
            if (count > 1) ans++;
        }
        System.out.println(ans);
    }
}
