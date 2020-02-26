

import java.lang.*;
import java.util.*;
import java.io.*;

public class word {
  public static void main(String[] args) {
  File f = new File("word.in");
  try(Scanner in = new Scanner(f)){
      try(PrintWriter writer = new PrintWriter("word.out", "UTF-8")){
      int k = in.nextInt();
      int n = in.nextInt();
      int flag = 0;
      String s;
      for(int i = 0;i<k;i++){
           s = in.next();
           if(flag + s.length() > n){
               writer.println();
               writer.print(s);
               flag = 0;
            }else{
                if(flag!= 0){
                    writer.print(" ");
                }
                writer.print(s);
            }
            flag += s.length();
            
        }
    }catch(IOException e){
        
        
    }
      
    } catch(IOException e){
        
        
    }
  }
}