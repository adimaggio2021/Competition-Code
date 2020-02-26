
import java.util.*;
import java.io.*;
import java.math.*;

public class swap {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("swap.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("swap.out")));
        int n = in.nextInt();
        int k = in.nextInt();
        int [] cows = new int[n];
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        for(int i = 0; i< n; i++){
            cows[i] = i + 1;
        }
        if(b1>a2 ||a1>b2){
            if(k%2 == 0){
                for(int i = 0; i< n; i++){
                    out.println(cows[i]);
                }
            }else{
                cows = reverse(cows, a1, a2);
                cows = reverse(cows, b1, b2);
                for(int i = 0; i< n; i++){
                    out.println(cows[i]);
                }
            }
        }else{
            for(int i = 0; i<k; i++){
                cows = reverse(cows, a1, a2);
                cows = reverse(cows, b1, b2);
            }
            for(int i = 0; i< n; i++){
                    out.println(cows[i]);
            }
        }
        
        out.close();
    }
    
    public static int[] reverse(int[] ar, int a, int b){
        int x = (b-a)+1;
        int [] rev = new int[x];
        System.out.println("here");
        for(int i = 0; i<x;i++){
            rev[i] = ar[a+i-1];
        }
        
        for(int j = 0; j<x;j++){
            ar[a+j-1] = rev[x-j-1];
        }
        return ar;
    }
}