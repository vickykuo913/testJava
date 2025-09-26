import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // 一直讀到 readLine() 為 null，表示 EOF
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length != 3) continue; // 避免輸入格式錯誤

            BigInteger A = new BigInteger(parts[0]);
            BigInteger B = new BigInteger(parts[1]);
            int K = Integer.parseInt(parts[2]);

            int cmp = A.compareTo(B);
            if (cmp == 0) {
                System.out.println("DRAW");
            } else if ((cmp > 0 && K == 1) || (cmp < 0 && K == -1)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

    }
}