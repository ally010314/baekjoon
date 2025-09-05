import java.util.Scanner;

public class N11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        int least = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            while (arr[i] <= K && K > 0) {

                K -= arr[i];
                least++;

            }
        }

        System.out.println(least);
    }

}
