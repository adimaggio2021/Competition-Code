
import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class rip
{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       ArrayList<String> names = new ArrayList<String>();
       names.add("Beatrice");
       names.add("Belinda");
       names.add("Bella");
       names.add("Betsy");
       names.add("Bessie");
       names.add("Blue");
       names.add("Buttercup");
       names.add("Sue");
       String s;
   
       ArrayList<Integer> al = new ArrayList<Integer>();
       for(int i= 0; i< size*10;i++){
           s = in.next();
           if(names.contains(s)){
               al.add(names.indexOf(s)+1);
            }
       }
       
       
       ArrayList<Integer> pass = new ArrayList<Integer>();
       pass.add(1);
       pass.add(2);
       pass.add(3);
       pass.add(4);
       pass.add(5);
       pass.add(6);
       pass.add(7);
       pass.add(8);
       ArrayList<Integer> result = new ArrayList<Integer>();
       result = recur(pass, al);
       for(int m : result){
           System.out.println(names.get(m-1));
        }
       
    }
    
    public static ArrayList<Integer> recur(ArrayList<Integer> elts, ArrayList<Integer> cons){
        int x = 0;
        int fac;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> used = new ArrayList<Integer>();
        for(int i = 1; i<9;i++){
            if(cons.indexOf(i) != cons.lastIndexOf(i)){
                x = 9;
            } else{
                result.add(i);
                used.add(i);
                fac = i;
                while(cons.contains(fac)){
                    if(cons.indexOf(fac) %2 == 0){
                        result.add(cons.get(fac+1));
                        used.add(cons.get(fac+1));
                    
              
                }
        }
    }
}