import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        List<Integer> results=new ArrayList<>();
        while (true){
            int a=in.nextInt();
            int b=in.nextInt();
            if (a==0 && b==0){
                break;
            }
            results.add(Math.max(a,b));
        }
        in.close();

        for (int res : results){
            System.out.println(res);
        }
    }
}