import java.util.*;

public class task02 {
    static long getMin(long n ){
        StringBuilder s = new StringBuilder(Long.toString(n));

        for(int i=0;i<s.length();i++){
            int digit = (s.charAt(i) -'0');
            int min = Math.min(digit, 9-digit);
            if(i==0 && digit ==9){
                s.setCharAt(i,(char) (9+'0'));
            }
            else
            s.setCharAt(i,(char) (min + '0'));
        }
            return Long.parseLong(s.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(getMin(n));
    }
}
