import java.io.*;

public class TransposeMatrix {

    // (0, 0), (0, 1), (0, 2)
    // (1, 0), (1, 1), (1, 2)
    // (2, 0), (2, 1), (2, 2)
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(100);

        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                // (0, 1)         // (1, 0)
                // (0, 2)         // (0, 2)
                // (1, 2)         // (2, 1)
                swap(matrix, i, j, j, i);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();


    }

    private static void swap(int[][] matrix, int idx1, int idx2, int idx3, int idx4) {
            int temp = matrix[idx1][idx2];
            matrix[idx1][idx2] = matrix[idx3][idx4];
            matrix[idx3][idx4] = temp;
    }
}
