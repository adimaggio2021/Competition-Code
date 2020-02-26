/*
ID: adimagg1
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;

class crypt1  {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("crypt1.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
    
    int n = in.nextInt();
    int []ar = new int[n];
    
    for(int i = 0;i<n;i++){
        ar[i] = in.nextInt();
    }
    
    int count = 0;
    
    for(int a: ar){
        for(int b: ar){
            for(int c: ar){
                for(int d: ar){
                    for(int e: ar){
                        int x = a*100 + b*10 + c;
                        int y = d*10 + e;
                        
                        if((x * (y%10)) / 1000 == 0 && (x * (y/10)) / 1000 == 0){
                            int check = x * (y%10);
                            int check2 = (x * (y/10));
                            int check3 = x*y;
                            boolean flag = true;
                            
                            for(int i = 0; i<3;i++){
                                if(!contains(ar,check%10))flag = false;
                                check = check / 10;
                            }
                            
                            for(int i = 0; i<3;i++){
                                if(!contains(ar,check2%10))flag = false;
                                check2 = check2 / 10;
                            }
                            
                            for(int i = 0; i<4;i++){
                                if(!contains(ar,check3%10))flag = false;
                                check3 = check3 / 10;
                            }
                            
                            if(flag)count++;
                            
                        }
                        
                    }
                }
            }
        }
    }
    
    out.println(count);
    out.close();
}

public static boolean contains(int[] ar, int n){
    for(int c : ar){
        if(c == n) return true;
    }
    
    return false;
}

}
