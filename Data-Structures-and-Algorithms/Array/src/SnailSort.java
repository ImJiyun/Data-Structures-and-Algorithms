import java.io.*;

public class SnailSort {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("src/input5.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(100);


        int testCase = Integer.parseInt(br.readLine().trim());

        // 우 하 좌 상
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int tc = 0; tc < testCase; tc++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[N][N];

            int count = 1;

            int d = 0;

            int rowIdx = 0;
            int colIdx = 0;


            while (count <= N * N) {
                arr[rowIdx][colIdx] = count++;

                int nextRowIdx = rowIdx + dr[d];
                int nextColIdx = colIdx + dc[d];

                if (nextRowIdx < 0 || nextRowIdx > N - 1 || nextColIdx < 0 || nextColIdx > N - 1
                        || arr[nextRowIdx][nextColIdx] != 0) {
                    d = (d + 1) % 4;
                    nextRowIdx = rowIdx + dr[d];
                    nextColIdx = colIdx + dc[d];
                }
                rowIdx = nextRowIdx;
                colIdx = nextColIdx;
            }
            StringBuilder tcSb = new StringBuilder();
            tcSb.append("#").append(tc).append("\n");

            // 배열을 순회하며 값을 출력한다.
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tcSb.append(arr[i][j]).append(" "); // 문자열 이어붙이기
                }
                tcSb.append("\n"); // 한 줄 끝났을 때 줄바꿈
            }
            sb.append(tcSb);

        }
        bw.write(sb.toString());
        bw.close();
    }
}
