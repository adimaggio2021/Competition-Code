                                                                                                                                                                                                                                                                                                                                                                     /*
ID: adimagg1
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;

class combo  {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("combo.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
    
    int n = in.nextInt();
    ArrayList<String> ar = new ArrayList<String>(); 
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int e = in.nextInt();
    int g = in.nextInt();
    
    if(n ==1){
        out.println(1);
    }else if(n==2){
        out.println(8);
    //}else if(n==4){
       // out.println(64);
    }else{
 
        
        int[] aa = new int[5];
        for(int i = 0; i<5; i++){
            if( (a-2+i) == 0) {aa[i] = n;}
            else if( (a-2+i) == -1) {aa[i] = n-1;}
            else if((a-2+i)>n){aa[i] = (a-2+i) %n;}
            else{ aa[i] = (a-2+i);
        }
        System.out.println(aa[i]);
    }
                int[] bb = new int[5];
        for(int i = 0; i<5; i++){
            if( (b-2+i) == 0) {bb[i] = n;}
            else if( (b-2+i) == -1) {bb[i] = n-1;}
            else if((b-2+i)>n){bb[i] = (b-2+i) %n;}
            else{ bb[i] = (b-2+i);
        }
    }
    System.out.println();
                int[] cc = new int[5];
        for(int i = 0; i<5; i++){
            if( (c-2+i) == 0) {cc[i] = n;}
            else if( (c-2+i) == -1) {cc[i] = n-1;}
            else if((c-2+i)>n){cc[i] = (c-2+i) %n;}
            else{cc[i] = (c-2+i);
        }
        System.out.println(cc[i]);
    }  
        int[] dd = new int[5];
        for(int i = 0; i<5; i++){
            if( (d-2+i) == 0) {dd[i] = n;}
            else if( (d-2+i) == -1) {dd[i] = n-1;}
            else if((d-2+i)>n){dd[i] = (d-2+i) %n;}
            else{ dd[i] = (d-2+i);
        }
    }
                int[] ee = new int[5];
        for(int i = 0; i<5; i++){
            if( (e-2+i) == 0) {ee[i] = n;}
            else if( (e-2+i) == -1) {ee[i] = n-1;}
            else if((e-2+i)>n){ee[i] = (e-2+i) %n;}
            else{ ee[i] = (e-2+i);
        }
    }
                int[] gg = new int[5];
        for(int i = 0; i<5; i++){
            if( (g-2+i) == 0) {gg[i] = n;}
            else if( (g-2+i) == -1) {gg[i] = n-1;}
            else if((g-2+i)>n){gg[i] = (g-2+i) %n;}
            else{ gg[i] = (g-2+i);
        }
    }
    
    for(Integer i : aa){
        for(Integer j : bb){
            for(Integer k : cc){
                String x  = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                ar.add(x);
            }
        }
    }
    
    for(Integer i : dd){
        for(Integer j : ee){
            for(Integer k : gg){
                String x  = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                ar.add(x);
            }
        }
    }
    
    ArrayList<String> used = new ArrayList<String>(); 
    int count = 0;
    
    for(String y : ar){
        System.out.println(y);
        if(!used.contains(y))count++;
        used.add(y);
    }
    
    out.println(count);
}
    out.close();
}


}
