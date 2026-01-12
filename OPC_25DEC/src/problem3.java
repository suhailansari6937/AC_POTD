// C. The Glitched Nice List Calculator
import java.util.*;

public class problem3 {
    static String niceCalculator(String s1 , String s2){
        StringBuilder s = new StringBuilder();
        int n1 = s1.length()-1;
        int n2 = s2.length()-1;
        while(n1>=0 && n2>=0){
            int num1 = s1.charAt(n1) - '0';
            int num2 = s2.charAt(n2) -'0';
            int sum = num1+num2;
            s.insert(0,(sum));
            n1--;
            n2--;

        }
        if(n1>=0){
            s.insert(0,s1.substring(0,n1+1));
        }
        if(n2>=0){
            s.insert(0,s2.substring(0,n2+1));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(niceCalculator(s1,s2));


    }
}
