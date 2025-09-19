import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N24479_1 {

    static int[][] adj;
    static int[] visitOrder;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //그래프 초기화 - 인접행렬방식
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        //이차원 배열생성, int배열은 자동으로 0으로 초기화됨
        adj = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        visitOrder = new int[n + 1];
        count = 1;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            //양방향이므로 u와 v가 연결되었음을 1로 표시
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        dfs(r);

        //각 정점의 방문 순서를 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(visitOrder[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void dfs(int node) {
        visited[node] = true;
        visitOrder[node] = count++;
        for (int nextNode = 1; nextNode <= adj.length - 1; nextNode++) {
            if (adj[node][nextNode] == 1 && !visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}