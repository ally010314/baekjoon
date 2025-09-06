import java.util.Scanner;
import java.util.Stack;

public class N10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k; i++){

            int num = sc.nextInt();

            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);


            }

        }


        int sum=0 ;
        while(!stack.isEmpty()){
            sum += stack.peek();
            stack.pop();
        }

        System.out.println(sum);

    }

}
