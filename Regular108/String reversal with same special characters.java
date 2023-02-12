import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res="";
        String rev="";
        int n =0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i)))
                rev=str.charAt(i)+rev;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res= res+rev.charAt(n);
                n++;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
