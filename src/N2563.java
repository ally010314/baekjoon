import java.util.Scanner;

class N2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 100x100 크기의 도화지를 나타내는 2차원 배열 선언
        boolean[][] paper = new boolean[101][101];

        int n = sc.nextInt(); // 색종이의 수
        int totalArea = 0;    // 검은 영역의 넓이

        // n개의 색종이 정보를 입력받아 도화지에 표시
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 색종이의 왼쪽 아래 x 좌표
            int y = sc.nextInt(); // 색종이의 왼쪽 아래 y 좌표

            // 해당 색종이가 차지하는 영역을 도화지에 표시 (10x10 크기)
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    // 아직 칠해지지 않은 부분이라면
                    if (!paper[j][k]) {
                        paper[j][k] = true; // 검은색으로 칠하고
                        totalArea++;        // 넓이를 1 증가시킨다
                    }
                }
            }
        }

        System.out.println(totalArea);
    }
}