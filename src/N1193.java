import java.util.Scanner;

public class N1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a = 0;
        int b = 0;
        int count = 0;

        int son=1;
        int mom=1;

        for(int i=1;n>a;i++){
            a = a+i;
            count ++;

        }

        for(int i=1;i<count;i++){
            b = b+i;
        }

        int c = n-b;

        if(count%2==0){
            mom = count;
            for(int i=1;i<c;i++){
                son++;
                mom--;
            }

        }else {
            son = count;
            for(int i=1;i<c;i++){
                son--;
                mom++;
            }

        }

        System.out.println(son+"/"+mom);



    }

}
