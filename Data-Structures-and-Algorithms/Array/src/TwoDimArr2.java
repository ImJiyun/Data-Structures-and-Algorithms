import java.io.*;

public class TwoDimArr2 {
    // array
    // 1  2  3
    // 4  5  6
    // 7  8  9
    // index (1, 1)
    // print 2 8 4 6
    // index (0, 0)
    // print 2 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(100);

        int[][] arr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        String[] rowCol = br.readLine().trim().split(" ");
        int rowIdx = Integer.parseInt(rowCol[0]);
        int colIdx = Integer.parseInt(rowCol[1]);

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int d = 0; d < dr.length; d++) {
            int nextRowIdx = rowIdx + dr[d];
            int nextColIdx = colIdx + dc[d];

            if (nextRowIdx >= 0 && nextRowIdx <= arr.length - 1 && nextColIdx >= 0 && nextColIdx <= arr[0].length - 1) {
                sb.append(arr[nextRowIdx][nextColIdx]).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
