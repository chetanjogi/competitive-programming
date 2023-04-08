import java.util.Scanner;

public class Word_Capitalization_281A {
    public static void main(String[] args) {

        // 1. With String builder

//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        StringBuilder stringBuilder = new StringBuilder(s);
//        char c = stringBuilder.charAt(0);
//        if (c>='a' && c <='z'){
//            stringBuilder.deleteCharAt(0);
//            c = (char) (c -32);
//            stringBuilder.insert(0,c);
//        }
//        System.out.println(stringBuilder);



        //2. without String Builder class
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println((s.charAt(0)+"").toUpperCase() + s.substring(1));
    }
}
