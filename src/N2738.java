import java.util.Scanner;

class N2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] num = s.split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] C = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                A[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                B[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");

            }
            System.out.println();
        }


    }

}
