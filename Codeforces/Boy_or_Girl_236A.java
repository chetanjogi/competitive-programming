import java.util.Scanner;

public class Boy_or_Girl_236A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // 1. by Using set data structure.

//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            set.add(s.charAt(i));
//        }
//        if (set.size()%2==0) System.out.println("CHAT WITH HER!");
//        else System.out.println("IGNORE HIM!");

        // 2. By using streams
//        System.out.println(s.chars().distinct().count()%2 == 0 ? "CHAT WITH HER!":"IGNORE HIM!");

//        // 3. loop through ascii values
        char c =9;
        int n = 0;
        while (c++<125) {
            if (s.contains(c+""))n++;
        }
        System.out.println(n%2==0?"CHAT WITH HER!" : "IGNORE HIM!");
    }

}
