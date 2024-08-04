import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 1 2 3     // 7  4  1
// 4 5 6     // 8  5  2
// 7 8 9     // 9  6  3
// row at 0 -> column at 2
// row at 1 -> column at 1
// row at 2 -> column at 0
// column at 0 -> row at 0
// column at 1 -> row at 1
// column at 2 => row at 2
public class Clockwise {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(100);

        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        // Rotate a matrix by 90 degree
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        // print the new matrix
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                sb.append(newMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();

    }
}
