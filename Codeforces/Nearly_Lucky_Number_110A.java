import java.util.Scanner;

public class Nearly_Lucky_Number_110A {
    private static int count;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();

        // 1. loop through all chars
        for (char c : s.toCharArray()) {
            if (c == '4' || c=='7')count++;
        }
        System.out.println(count==4||count==7 ? "YES":"NO");

        //alternative :  replace all except 4 and 7
//        s = s.replaceAll("[^47]","");
//        System.out.println(s.length()==4 || s.length()==7 ? "YES" :"NO");
    }

}
