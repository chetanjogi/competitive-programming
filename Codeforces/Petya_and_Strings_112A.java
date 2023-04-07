import java.util.Scanner;

public class Petya_and_Strings_112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int val = s1.compareToIgnoreCase(s2);
        if( val< 0){
            System.out.println(-1);
        } else if (val > 0 ) {
            System.out.println(1);
        }else
            System.out.println(0);
    }
}
