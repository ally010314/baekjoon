import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class N24480 {

    static Boolean[] visited;
    static ArrayList<Integer>[] adj;
    static int[] visitOrder;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visited = new Boolean[N + 1];
        visitOrder = new int[N + 1];
        count = 1;

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
            visited[i] = false;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i], Collections.reverseOrder());

        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(visitOrder[i]).append("\n");
        }

        System.out.println(sb);


    }

    static void dfs(int node) {

        visited[node] = true;
        visitOrder[node] = count;
        count++;

        for (int i = 0; i < adj[node].size(); i++) {


            int next = adj[node].get(i);

            while (!visited[next]) {
                dfs(next);
            }


        }


    }

}
