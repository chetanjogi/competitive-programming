import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // 1. method loop through all the chars
//        int high = 0,low =0;
//        for (char c : s.toCharArray()) {
//            if (c >='a' && c<='z') low++;
//            else high++;
//        }
//
//        System.out.println(high > low ? s.toUpperCase() : s.toLowerCase());

        // 2. method loop until more than half of the count reaches.
        System.out.println(s.chars().filter(c -> c <97).count()*2 > s.length() ? s.toUpperCase() :s.toLowerCase());
    }

}
