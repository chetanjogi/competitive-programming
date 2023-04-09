import java.util.Scanner;

public class Bear_and_Big_Brother_791A {

    public static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        while(a<=b){
//            a*=3;
//            b*=2;
//            count++;
//        }
//        System.out.println(count);

        for (; a<=b ; a*=3,b*=2) {
            count++;
        }
        System.out.println(count);
    }

}
