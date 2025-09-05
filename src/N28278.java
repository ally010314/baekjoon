import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder는 변경 가능한 문자열을 만들어줌
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    int toPush = Integer.parseInt(st.nextToken());
                    stack.push(toPush);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int toPop = stack.pop();
                        sb.append(toPop).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;

                case 3:
                    sb.append(stack.size()).append("\n");
                    break;

                case 4:
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;

                case 5:
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
            }
        }

        System.out.println(sb);


    }

}
