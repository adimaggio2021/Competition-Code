
import java.util.*;
import java.io.*;
import java.math.*;

public class breedflip {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("breedflip.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        int n = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();
        int[] ar = new int[n];
        for(int i = 0 ;i<n;i++){
            if(s1.charAt(i) == s2.charAt(i)){ar[i] = 0;}
            else{ar[i] = 1;}
            
        }
        int count = 0;
        int toggle = 0;
        for(int j : ar){
            if(j == 1){
                if(toggle == 0){
                    count++;
                    toggle = 1;
                }
            }else{
                toggle = 0;
            }
        }
        out.println(count);
        out.close();
        
    }
    
}