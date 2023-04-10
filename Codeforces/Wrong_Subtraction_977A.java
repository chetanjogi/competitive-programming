import java.util.Scanner;

public class Wrong_Subtraction_977A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        while (k-->0){
            if(n%10!=0){
                n--;
            }else{
                n/=10;
            }
        }
        System.out.println(n);
    }

}
