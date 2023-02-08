import java.io.*;
import java.util.*;

class IntegerList{
    private List<Integer> list;
    private int  elementIndex = 0;
    private int size;
    public IntegerList(int size){
        this.size = size;
        list = new ArrayList<>();
    }
    public void add(int value){
        if(elementIndex<size){
            list.add(value);
            elementIndex++;
        }
        else{
            System.out.println("can't add, list is full");
        }
    }
    public String toString(){
        String result = "";
        for(int i=0;i<size;i++){
            result =result+i + " : " + list.get(i)+"\n";
        }
        return result;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        System.out.println(nums);
    }
}
