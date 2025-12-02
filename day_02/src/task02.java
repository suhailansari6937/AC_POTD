// Leetcode - 682. Baseball Game

import java.util.*;
public class task02 {
    static int calPoints(String[] op) {
        ArrayList<Integer> li = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < op.length; i++) {
            if (op[i].matches("-?\\d+")) {
                li.add(Integer.parseInt(op[i]));
            } else if (op[i].equals("+")) {
                li.add(li.get(li.size() - 2) + li.get(li.size() - 1));
            } else if (op[i].equals("D")) {
                li.add(2 * li.get(li.size() - 1));
            } else
                li.remove(li.size() - 1);
        }
        for (int i = 0; i < li.size(); i++) {
            sum += li.get(i);
        }


        return sum;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter number of element in array :");
         int n = sc.nextInt();
         String [] str = new String[n];
         System.out.println("Enter elements ");
         for(int i=0;i<n;i++){
             str[i] = sc.next();
         }
         int ans  = calPoints(str);
         System.out.println(ans);

    }
}
