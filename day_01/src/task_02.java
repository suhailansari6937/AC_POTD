import java.util.Scanner;

public class task_02 {
    static int moneyRequired(int k, int n,int w){
        int totalCost = 0;
        for(int i=1;i<=w;i++){
            totalCost+=k*i;
        }
        if(totalCost>=n) return totalCost-n;
        return 0;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int ans= moneyRequired(k,n,w);
        System.out.println(ans);

    }
}
