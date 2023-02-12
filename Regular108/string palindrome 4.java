import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String m = "";
        for(int i = str.length()-1;i>=0;i--){
            m = m+str.charAt(i);
        }
        
            if(str.toLowerCase().equals(m.toLowerCase())){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
        
    }
