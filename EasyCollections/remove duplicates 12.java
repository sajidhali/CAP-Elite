import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashSet; 

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        int i=0;
        String s="";
   HashSet<Character> c = new HashSet<Character>();
    for(i=0;i<str.length();i++){
    if(c.contains(str.charAt(i))==false)
      {
            c.add(str.charAt(i));
            s+=str.charAt(i);
      }
    }
     System.out.println(s);
}
}
        
    

