import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
           int p=sc.nextInt();
           k(p,s);
        
        }}
public static void k(int p,String s){
       char g=s.charAt(p-1);
            int count=0;
            for(int j=0;j<p-1;j++){
                if(s.charAt(j)==g){
                    count+=1;
                }
                
            }
            System.out.println(count);
           }

    }
