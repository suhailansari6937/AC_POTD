import java.util.Scanner;

public class task2 {
    static void checkPalindrome(String s){
        int n =s.length();
        int distinct=0;
        if(n<=3) {
            System.out.println("NO");
            return;
        }
        // count different characters
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)== s.charAt(j)){
                    check=false;
                    break;
                }
            }
            if(check) distinct++;
        }
        if(distinct==1){
            System.out.println("NO");
            return;
        }


        System.out.println("YES");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            checkPalindrome(s);
        }

    }
}
