import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class N24479 {

    static ArrayList<Integer>[] adj;
    static int[] visitOrder;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        //그래프 초기화 - 인접리스트방식
        //배열의 타입이 ArrayList
        //ArrayList객체의 참조값을 저장할 수 있는 빈공간 n+1개를 만들기
        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visitOrder = new int[n + 1];
        count = 1;

        //adj->[null,{},{},.......,{}] 각각의 {}는 ArrayList
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        //각 정점마다 자신과 연결된 다른 정점들의 목록을 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(adj[i]);
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
        // 현재 정점(node)의 이웃 리스트(adj[node])에서 이웃들을 하나씩 꺼내 nextNode에 담아서 반복
        for (int nextNode : adj[node]) {
            if (!visited[nextNode]) {
                dfs(nextNode);//dfs에서 재귀는 stack을 사용하는것과 같음
                //함수  A가 B를 호출하면 함수 B가 끝나면 돌아올 주소를  stack의 맨 위에 push
                // B 실행이 끝나면 stack의 맨 위에서 pop하고 그 안의 복귀 주소로 돌아가 함수 A의 다음 코드를 실행
            }
        }
    }
}