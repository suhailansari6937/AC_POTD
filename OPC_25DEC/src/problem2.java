//B. The Grinch's Sticky Gift-List
// I couldn't be able to solve in the contest  wrong output on test case 11
import java.util.*;
public class problem2 {
    static  String correct(String s, int k ){
        int count =0;
        StringBuilder sb= new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                if(i==1 || s.charAt(i) !=s.charAt(i-2)){
                    count++;
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
       return  count == k? sb.toString() : "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(correct(s,k));


    }

}
