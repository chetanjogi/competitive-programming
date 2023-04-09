import java.util.Scanner;

public class Solider_and_Bananas_546A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), n = scanner.nextInt(), w = scanner.nextInt();
        int totalMoneyToBuyWBananas = k * (w*(w+1)/2);
        int borrow_amount = totalMoneyToBuyWBananas - n;
        System.out.println(Math.max(borrow_amount,0));
    }

}
