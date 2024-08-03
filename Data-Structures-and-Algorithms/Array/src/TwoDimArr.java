import java.io.*;

public class TwoDimArr {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(100);

        int[][] arr = new int[][] {{4, 3, 2}, {3, 7, 9}, {1, 4, 9}};

        sb.append("행 우선 정방향 순회").append("\n");
        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr[rowIdx].length; colIdx++) {
                sb.append(arr[rowIdx][colIdx]).append(" ");
            }
            sb.append("\n");
        }


        sb.append("행 우선 역방향 순회").append("\n");
        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = arr.length - 1; colIdx >= 0; colIdx--) {
                sb.append(arr[rowIdx][colIdx]).append(" ");
            }
            sb.append("\n");
        }


        sb.append("열 우선 정방향 순회").append("\n");
        for (int colIdx = 0; colIdx < arr[0].length; colIdx++) {
            for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
                sb.append(arr[rowIdx][colIdx]).append(" ");
            }
            sb.append("\n");
        }

        sb.append("열 우선 역방향 순회").append("\n");
        for (int colIdx =  0; colIdx < arr[0].length; colIdx++) {
            for (int rowIdx = arr.length - 1; rowIdx >= 0; rowIdx--) {
                sb.append(arr[rowIdx][colIdx]).append(" ");
            }
            sb.append("\n");

        }

        sb.append("지그재그 순회").append("\n");
        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr[rowIdx].length; colIdx++) {
                sb.append(arr[rowIdx][rowIdx % 2 == 0 ? colIdx : arr[rowIdx].length - 1 - colIdx]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.close();
    }
}
