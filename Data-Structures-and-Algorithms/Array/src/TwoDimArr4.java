import java.io.*;

public class TwoDimArr4 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/input2.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(100);

        int testCase = Integer.parseInt(br.readLine().trim());

        // 상 하 좌 우 좌상 좌하 우상 우하
        int[] dr = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dc = {0, 0, -1, 1, -1, -1, 1, 1};

        for (int tc = 1; tc <= testCase; tc++) {

            int N = Integer.parseInt(br.readLine().trim());

            char[][] arr = new char[N][N];

            // 배열에 값 넣기
            for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
                String[] oneLine = br.readLine().trim().split(" ");
                for (int colIdx = 0; colIdx < arr.length; colIdx++) {
                    arr[rowIdx][colIdx] = oneLine[colIdx].charAt(0);
                }
            }

            //
            int sumMax = 0;

            for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
                for (int colIdx = 0; colIdx < arr.length; colIdx++) {
                    int sum = 0;
                    boolean hasG = false;

                    // 현재 값이 B일 때
                    if (arr[rowIdx][colIdx] == 'B') {
                        for (int d = 0; d < dr.length; d++) {
                            // 주변 값 탐색
                            int nextRowIdx = rowIdx + dr[d];
                            int nextColIdx = colIdx + dc[d];
                            // 주변 값이 배열의 범위를 넘어가는지 검사
                            if (nextRowIdx >= 0 && nextRowIdx <= N - 1 && nextColIdx >= 0 && nextColIdx <= N-1) {
                                // 주변 값 중 G가 있으면 검사 종료
                                if (arr[nextRowIdx][nextColIdx] == 'G') {
                                    hasG = true;
                                    break;
                                }

                            }
                        }
                        if (!hasG) {
                            // 현재 위치에서 행 검사
                            for (int i = 0; i < N; i++) {
                                if (arr[rowIdx][i] == 'B') sum++;
                            }
                            // 현재 위치에서 열 검사
                            for (int i = 0; i < N; i++) {
                                if (arr[i][colIdx] == 'B') sum++;
                            }
                            // 중복된 값 하나 제거
                            sum--;
                        }
                    }
                    sumMax = Math.max(sum, sumMax);
                }
            }
            sb.append("#").append(tc).append(" ").append(sumMax).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
