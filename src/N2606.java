import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N2606 {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i <= n; i++){
            visited[i] = false;
            adj[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }

        dfs(1);

        System.out.println(count);

    }


    public static void dfs(int r){



        visited[r] = true;
        for(int next: adj[r]){
            if(!visited[next]){
                count++;
                dfs(next);
            }
        }


    }


}
