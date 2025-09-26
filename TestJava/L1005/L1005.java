import java.util.Scanner;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            if (m == 0) break;  // 輸入結束

            int partner = sumOfDivisors(m);
            int check = sumOfDivisors(partner);

            if (check == m && partner != m) {
                System.out.println(partner);
            } else {
                System.out.println("QQ");
            }
        }
        sc.close();
    }

    // 計算一個數字的「真因數和」
    static int sumOfDivisors(int n) {
        int sum = 1; // 1 一定是因數
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;

    }
}