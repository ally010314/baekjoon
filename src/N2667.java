import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N2667 {

    static int[][] adj;
    static Boolean[][] visited;
    static ArrayList<Integer> aptList = new ArrayList<>();
    static int house;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        adj = new int[n][n];
        visited = new Boolean[n][n];
        house = 0;

        for (int i = 0; i < n; i++) {

            String line = br.readLine().trim();

            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
                adj[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adj[i][j] == 1 && !visited[i][j]) {
                    house++;
                    dfs(i, j);
                    aptList.add(house);
                    house = 0;
                }
            }

        }
        java.util.Collections.sort(aptList);
        System.out.println(aptList.size());
        for (int h : aptList) {
            System.out.println(h);
        }

    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;

        //아래
        if(i+1<adj.length){
            if(adj[i+1][j] == 1 && visited[i+1][j] == false){
                visited[i+1][j] = true;
                house++;
                dfs(i+1, j);

            }

        }
        //오른쪽
        if(j+1<adj.length){
            if(adj[i][j+1] == 1 && visited[i][j+1] == false){
                visited[i][j+1] = true;
                house++;
                dfs( i, j+1);

            }

        }
        //위
        if(i-1>=0){
            if(adj[i-1][j] == 1 && visited[i-1][j] == false){
                visited[i-1][j] = true;
                house++;
                dfs(i-1, j);

            }

        }
        //왼쪽
        if(j-1>=0){
            if(adj[i][j-1] == 1 && visited[i][j-1] == false){
                visited[i][j-1] = true;
                house++;
                dfs(i, j-1);
            }

        }

    }

}
