import java.util.Scanner;

public class WayTooLongWords_71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String s = "";
        while (num-->0){
            s = scanner.nextLine();
            int len = s.length()-1;
            if (s.length() >10) {
                System.out.println(""+s.charAt(0) + (len-1)+s.charAt(len));
            }else System.out.println(s);
        }
    }
}
