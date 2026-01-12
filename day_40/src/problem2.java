// Leetcode 344. Reverse String

public class problem2 {
     static void reverseString(char[] s) {
        int n = s.length;
        int i=0;
        int j =n-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

    }

}
