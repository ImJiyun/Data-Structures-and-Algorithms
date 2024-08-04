import java.io.*;

// given 2 * 2 array
// find the largest sum ((a, a) + (a-1, a) + (a+1, a) + (a, a-1), (a, a+1))
public class TwoDimArr3 {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(100);

        int N = Integer.parseInt(br.readLine().trim());

        int[][] arr = new int[N][N];

        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            String[] numStrings = br.readLine().trim().split(" ");
            for (int colIdx = 0; colIdx < arr.length; colIdx++) {
                arr[rowIdx][colIdx] = Integer.parseInt(numStrings[colIdx]);
            }
        }

        // delta array
        // north south west east
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int max = 0;

        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr.length; colIdx++) {
                int sum = 0;
                sum += arr[rowIdx][colIdx];
                for (int d = 0; d < 4; d++) {
                    int nextRowIdx = rowIdx + dr[d];
                    int nextColIdx = colIdx + dc[d];

                    if (d == 0) {
                        if (nextRowIdx >= 0) sum += arr[nextRowIdx][colIdx];
                    } else if (d == 1) {
                        if (nextRowIdx <= arr.length - 1) sum += arr[nextRowIdx][colIdx];
                    } else if (d == 2) {
                        if (nextColIdx >= 0) sum += arr[rowIdx][nextColIdx];
                    } else {
                        if (nextColIdx <= arr.length -1) sum += arr[rowIdx][nextColIdx];
                    }
                }
                max = Math.max(sum, max);
            }
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.close();


    }
}
