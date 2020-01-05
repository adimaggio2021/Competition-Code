
import java.lang.*;
import java.util.*;

public class acsl {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    for(int m = 0;m<5;m++){
    int n = in.nextInt();
    System.out.println(n);
    int p = in.nextInt();
    int act = n;

    for (int i = 1; i<p;i++){
      act = act / 10;
    }
    int pnum = act % 10 ;

    int result = 0;
    int j = 0;
    int digit;
    int scale;

    while(n != 0){
      if(j< p){
        digit = Math.abs(n %10 - pnum);
        scale = 1;
        for(int i = 0; i<j; i++){
          scale = scale *  10;
        }
        result = result + digit*scale;
      }
      if(j == p){
        scale = 1;
        for(int i = 0; i<j; i++){
          scale = scale *  10;
        }
        result = result + pnum*scale;
      }
      if(j> p){
        digit = (n %10 + pnum) % 10;
        scale = 1;
        for(int i = 0; i<j; i++){
          scale = scale *  10;
        }
        result = result + digit*scale;
      }
      n = n / 10;
      j++;
    }
    System.out.println(result);
    }
  }
}