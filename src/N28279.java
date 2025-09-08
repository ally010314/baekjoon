import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if(command == 1){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(command == 2){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if(command == 3){
                if(!deque.isEmpty()){
                    int toPoll = deque.pollFirst();
                    sb.append(toPoll).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command == 4){
                if(!deque.isEmpty()){
                    int toPoll = deque.pollLast();
                    sb.append(toPoll).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command == 5){
                sb.append(deque.size()).append("\n");

            }else if(command == 6){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(command == 7){
                if(!deque.isEmpty()){
                    sb.append(deque.peek()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command == 8){
                if(!deque.isEmpty()){
                    sb.append(deque.peekLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

}
