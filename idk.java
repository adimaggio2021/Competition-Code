
/**
 * Write a description of class idk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.*;
import java.util.Scanner;
import java.util.*;

public class idk
{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int session = in.nextInt();
       int cown = in.nextInt();
       int[] arr = new int[cown*session];
       for(int i = 0; i< cown*session; i++){
           arr[i] = in.nextInt();
       }
       int concount = 0;
       int firstcow;
       int secow;
       int indic = 0;
       int top;
       boolean first = false;
       boolean second = false;
       boolean firstw = false;
       boolean secondw = false;
       for(int j = 1; j<=cown;j++){
           firstcow = j;
           for(int k = 1; k<=cown;k++){
               indic = 0;
               first = false;
               second = false;
               firstw = false;
               secondw = false;
               secow = k;
               for(int f = 0; f<session;f++){
                   top = indic+4;
                   first = false;
                   second = false;
                   for(;indic<top;indic++){
                       if(arr[indic] == firstcow){
                           first = true;
                        }
                        if(arr[indic] == secow){
                           second = true;
                        }
                        if(first && !second){
                            firstw = true;
                        }
                        if(!first && second){
                            secondw = true;
                        }
                    }
                }
                if(secondw ^ firstw){
                    concount++;
                }
          }
    }
}
}
