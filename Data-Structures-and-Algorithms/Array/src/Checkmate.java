import java.io.*;

//
public class Checkmate {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("src/input3.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(100);
        int testCase = Integer.parseInt(br.readLine().trim());

        // 상 하 좌 우 좌상 좌하 우상 우하
        int[] dr = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dc = {0, 0, -1, 1, -1, -1, 1, 1};

        for (int tc = 1; tc <= testCase; tc++) {
            int N = Integer.parseInt(br.readLine().trim());

            int[][] arr = new int[N][N];

            String[] line = br.readLine().trim().split(" ");

            // 블랙 퀸이 화이트 킹을 공격하는 상황만 고려
            int wRowIdx = Integer.parseInt(line[0]) - 1;
            int wColIdx = Integer.parseInt(line[1]) - 1;
            int bRowIdx = Integer.parseInt(line[2]) - 1;
            int bColIdx = Integer.parseInt(line[3]) - 1;

            int answer = 0;

            for (int d = 0; d < dr.length; d++) {
                int nextBRowIdx = bRowIdx + dr[d];
                int nextBColIdx = bColIdx + dc[d];

                if (nextBRowIdx >= 0 && nextBRowIdx <= N - 1) {
                    if (nextBRowIdx == wRowIdx && nextBColIdx == wColIdx) {
                        answer = 1;
                        break;
                    }
                }
            }
            sb.append("#").append(tc).append(" ").append(answer).append("\n");

        }
        bw.write(sb.toString());
        bw.close();
    }
}
