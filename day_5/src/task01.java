import java.util.Scanner;

public class task01 {
    static int stringCheck(String s){
        int ans =0;
        if(s.equals("++X") || s.equals("X++")){
            ans++;
        }
        else ans--;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            String a = sc.next();
           ans+=stringCheck(a);

        }
        System.out.println(ans);
    }
}
