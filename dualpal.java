/*
ID: adimagg1
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
import java.util.*;

class dualpal {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("dualpal.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
    int indexer = 0;
    int n = in.nextInt();
    int s = in.nextInt();
     long[] arr = new long[n];
    for(long i = s+1; i<9920384;i++){
        int count = 0;
        for(int b = 2; b<11;b++){
            if(isPal(convert(i,b))){
                count++;
            }
        }
        if(count>=2){
            arr[indexer] = i;
            indexer++;
        }
        
        if(indexer>=n){
            break;
        }
    }
    for(long h : arr){
        out.print(h);
        out.println();
    }
    out.close();
}

    public static String convert(long inputNum, int base1){
        String s = ""; 
  
    // Convert input number is given  
    // base by repeatedly dividing it 
    // by base and taking remainder 
    while (inputNum > 0) 
    { 
        s += reVal(inputNum % base1); 
        inputNum /= base1; 
    } 
    StringBuilder ix = new StringBuilder();  
  
        // append a string into StringBuilder input1  
        ix.append(s);  
  
    // Reverse the result 
    return new String(ix.reverse()); 
    }
    
    public static char reVal(long num) 
{ 
    if (num >= 0 && num <= 9) 
        return (char)(num + 48); 
    else
        return (char)(num - 10 + 65); 
} 

public static boolean isPal(String s){
    for(int i = 0; i<= (s.length()/2); i++){
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
    }
    return true;
}
}
