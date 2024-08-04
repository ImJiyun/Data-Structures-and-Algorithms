import java.io.*;

public class Array_Gravity {
    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/input4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb =  new StringBuilder(100);

        int testCase = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= testCase; tc++) {
            int N = Integer.parseInt(br.readLine().trim());

            int[] box = new int[N];

            String[] oneLine = br.readLine().trim().split(" ");
            for (int i = 0; i < box.length; i++) {
                box[i] = Integer.parseInt(oneLine[i]);
            }

            // 낙차를 담을 배열
            int[] diff = new int[N];
            //
            for (int i = 0; i < box.length; i++) {
                int count = 0;
                for (int j = i + 1; j < box.length; j++) {
                    if (box[i] > box[j]) {
                        count++;
                    }
                }
                diff[i] = count;
            }

            int max = 0;
            for (int i = 0; i < diff.length; i++) {
                if (diff[i] > max) {
                    max = diff[i];
                }
            }
            sb.append("#").append(tc).append(" ").append(max).append("\n");

        }
        bw.write(sb.toString());
        bw.close();

    }
}
