import java.util.Scanner;

public class N2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while(n>1){
            n = n-6*count;
            count++;

        }

        System.out.println(count);
    }

}
