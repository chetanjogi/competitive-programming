import java.util.Scanner;

public class NextRound_158A{
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int finisherScore = arr[k-1];
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] >= finisherScore && arr[i]!=0)count++;
        }
        System.out.println(Math.max(count, 0));
    }
}
