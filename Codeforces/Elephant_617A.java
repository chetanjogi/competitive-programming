import java.util.Scanner;

public class Elephant_617A {
    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // case - 1 : while loop
        while (x > 0){
            x -= Math.min(x, 5);
            count++;
        }
        System.out.println(count);

        // case - 2 : formula
        System.out.println((x+4)/5);

        //case -3 ceil method
        System.out.println((int)Math.ceil((double)x/5.0 ));
    }

}
