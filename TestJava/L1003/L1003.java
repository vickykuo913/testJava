import java.util.*;
public class L1003{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //List<Integer> results=new ArrayList<>();


        int n =in.nextInt();
        in.nextLine();

        StringBuilder S = new StringBuilder();
        for (int i=0; i<n; i++){
            String line=in.nextLine();
            S.append(line);
        }

        int m=in.nextInt();

        //StringBuilder ErrLog=new StringBuilder();
        StringBuilder result =new StringBuilder();
        for (int i=0; i<m; i++){
            int pos =in.nextInt();

            if (pos <= 0 || pos > S.length()) {
                // 超出範圍的處理
                //ErrLog.append("數字大小("+pos+")超過出字串"+S.length());
                //System.out.println("數字大小("+pos+")超過出字串"+S.length());
            }else{
                result.append(S.charAt(pos-1));
            }

        }


        in.close();

        System.out.println(result.toString());
    }
}