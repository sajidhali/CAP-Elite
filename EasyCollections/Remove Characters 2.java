import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String s1 = in.nextInt();
        String s2 = in.nextInt();
        ArrayList<Character> c1 = new ArrayList()<>;
        ArrayList<Character> c2 = new ArrayList()<>;
        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);
            c1.add(ch);
        }
        for(int i=0;i<s2.length();i++){
            char m = s2.charAt(i);
            c2.add(m);
        }
        for(Character n : c2){
            if(c1.contains(n)){
                c1.remove(n);
            }
            
        }
        for(character k :c1){
            System.out.println(n);
        }
         
    }

}
