import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N24444 {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] visitOrder;
    static int count ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        //변수들 초기화
        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        visitOrder = new int[N + 1];
        count =1;

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
            Collections.sort(adj[i]);
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            sb.append(visitOrder[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();

        q.add(node);
        visited[node] = true;
        visitOrder[node] = count++;

        while(!q.isEmpty()){
            int current = q.poll();
            for(int next: adj[current]){
                if(!visited[next]){
                    visited[next] = true;
                    visitOrder[next] = count++;
                    q.add(next);
                }
            }
        }
    }

}
