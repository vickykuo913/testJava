//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 座位數 (偶數)
        int M = sc.nextInt();   // 已被佔用的座位數

        boolean[] occupied = new boolean[N + 1]; // 1-based index

        for (int i = 0; i < M; i++) {
            int seat = sc.nextInt();
            if (seat >= 1 && seat <= N) {
                occupied[seat] = true;
            }
        }

        int count = 0;

        // 1. 同一欄上下相鄰 (奇數 i 與 i+1)
        for (int i = 1; i <= N - 1; i += 2) {
            if (!occupied[i] && !occupied[i + 1]) {
                count++;
            }
        }

        // 2. 上排左右相鄰 (奇數 i 與 i+2)
        for (int i = 1; i <= N - 2; i += 2) {
            if (!occupied[i] && !occupied[i + 2]) {
                count++;
            }
        }

        // 3. 下排左右相鄰 (偶數 i 與 i+2)
        for (int i = 2; i <= N - 2; i += 2) {
            if (!occupied[i] && !occupied[i + 2]) {
                count++;
            }
        }

        System.out.println(count);
    }
}