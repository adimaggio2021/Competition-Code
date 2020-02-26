

import java.lang.*;
import java.util.*;
import java.io.*;

public class race {
  public static void main(String[] args) {

      File f = new File("race.in");
      try(Scanner in = new Scanner(f)){
          try(PrintWriter writer = new PrintWriter("race.out", "UTF-8")){
          int k = in.nextInt();
          int n = in.nextInt();
          for(int i = 0;i<n;i++){
              int x = in.nextInt();
              int top = 0;
              for(int j = 0;j<=x;j++){
                    top+= j;
                }
              int total = 1;
              int max = 1;
              int seconds = 1;
              boolean flag = true;
              while(total<k){
                  if(total + arith(x,max+1) <= k){
                      total = total + max + 1;
                      max += 1;
                      seconds+=1;
                    }else if(total + arith(x,max) <= k){
                        total = total + max;
                        seconds+=1;
                    }else if(total + arith(x,max-1) <= k) {
                        total = total  + max - 1;
                        seconds += 1;
                        max -=1;
                    }
                    
                }
              
                writer.println(seconds);  
                if(i == n-1){
                    writer.close();
                }
           
            }
        }catch(IOException e){
          
    }
        }catch(IOException e){
          
    }
  }
  
  public static int arith(int x, int y){
      int total = 0;
      for(int i = x; i<=y;i++){
          total += i;
        }
        return total;
    }
}
