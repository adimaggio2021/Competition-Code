
/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: adimagg1
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;

class beads {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("beads.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    int n = in.nextInt();
    String s = in.next();
    int max = 0;
    int indexer = 0;
    for(int i = 0; i<n;i++){
        int test = count(s, n, i);
        if(test>max){
            max = test;
            indexer = i;
        }
    }
    out.print(max);
    out.println();
    out.close();                                  // close the output file
  }
  
   public static int count (String s, int n, int index){
      int result = 1;
      int top;
      if(index == n-1){
          top = 0;
       }else{
           top = index +1;
        }
      if(s.charAt(index) == 'b'){
         for(int i = index-1; i< n+2; i--){
        if(i == -1){
            i = n-1;
        }
             if(s.charAt(i) == 'b' || s.charAt(i) == 'w'){
                 result++;
        }else{
            break;
        }
        
        if(result>n*2){
            break;
        }
       
    }
  }else{for(int i = index-1; i< n; i--){
          if(i == -1){
            i = n-1;
        }
      if(s.charAt(i) == 'r' || s.charAt(i) == 'w'){
                 result++;
        }else{
            break;
        }
        if(result>n*2){
            break;
        }
        
    }
  }
  
   if(s.charAt(top) == 'b'){
         for(int i = index+1; i< n+2; i++){
           if(i == n){
            i = 0;
        }
             if(s.charAt(i) == 'b' || s.charAt(i) == 'w'){
                 result++;
        }else{
            break;
        }
        if(result>n*2){
            break;
        }
        
    }
  }else{for(int i = index+1; i< n+2; i++){
      if(i == n){
            i = 0;
        }
             if(s.charAt(i) == 'r' || s.charAt(i) == 'w'){
                 result++;
        }else{
            break;
        }
        if(result>n*2){
            break;
        }
        
    }
  }
  
  if(result>n){
      return n;
    }
  return result;
}
}   
