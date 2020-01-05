import java.lang.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    Scanner in = new Scanner("whereami.in");
    int size = in.nextInt();
    String s = in.nextLine();
    int result = 0;
    boolean flag = true;
    for(int k = 1; k<=size; k++){
      flag = true;
      for(int i = 0; i<=(size-k);i++){
        if(al.contains(s.substring(i,i+k))){
          flag = false;
        }else{
          al.add(s.substring(i,i+k));
        }
      }
      if(flag){
        result = k;
        break;
      }
      al.clear();
    }
    PrintWriter writer = new PrintWriter("whereami.out", "UTF-8");
writer.println(result);
writer.close();
  }
}
