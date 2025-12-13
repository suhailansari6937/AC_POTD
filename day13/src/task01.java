import java.util.*;
public class task01 {
    static List<List<Integer>> pascalTriangle(int n ){
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> li = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if(j==0 || j==i){
                    li.add(1);
                }
                else {
                    int x = lists.get(i-1).get(j-1);
                    int y = lists.get(i-1).get(j);
                    li.add(x+y);
                }
            }
            lists.add(li);
        }
        return lists;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pascalTriangle(n));


    }
}
