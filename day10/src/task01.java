import java.util.Scanner;

public class task01 {


        static String addStrings(String num1, String num2) {
            StringBuilder s = new StringBuilder();
            int x=0;
            int n1= num1.length()-1;
            int n2 = num2.length()-1;
            while(n1>=0 && n2>=0){

                int v1 = num1.charAt(n1) -'0';
                int v2 = num2.charAt(n2) - '0';
                int num = x+v1+v2;
                if(num<10){
                    s.insert(0,num);
                    x=0;
                }
                else{
                    s.insert(0,num%10);
                    x=num/10;

                }
                n1--;
                n2--;
            }
            while(n1>=0){
                int m = num1.charAt(n1)-'0';
                s.insert(0,(x+m)%10);
                x=(x+m)/10;
                n1--;
            }

            while(n2>=0){

                int m = num2.charAt(n2)-'0';
                s.insert(0,(x+m)%10);
                x=(x+m)/10;
                n2--;
            }
            if(x>0) s.insert(0,x);

            return s.toString();

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(addStrings(num1,num2));

    }
}
