import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
    
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradi
    ngStudents' function below.else if(((grades(i)/5)+1)*5)>3){
                System.out.println(grades(i));
            }
            else{
                k=(((grades(i)/5)+1)*5);
            }
        
        
    

    }

}
     *
     * The function is expected to r
    eturn an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */



    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<Integer>();
        int size=grades.size();
        int k,l;
        
        for(int i=0;i<size;i++){
            int a=grades.get(i);
            if(a<38){
                list.add(a);
            }
            else if(((a/5+1)*5-a)>=3){
                k=(((a/5+1)*5));
                list.add(a);
            }
             else{
                l=(a/5+1)*5;
                list.add(l);
            }
        }
    
    return list;
    }
}
    
            

        


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
