
/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: adimagg1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("gift1.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    int np = in.nextInt();
    ArrayList<Integer> pn = new ArrayList<Integer>();
    for(int i = 0; i<np;i++){
        pn.add(0);
    }
    String t = in.nextLine();
    ArrayList<String> sn = new ArrayList<String>();
    for(int i = 0; i<np; i++){
        sn.add(in.nextLine());
    }
    
    for(String s : sn){
        System.out.println(s);
    }
    
    for(int i = 0; i<np;i++){
        String s = in.nextLine();
        int indexer = sn.indexOf(s);
        int amount = in.nextInt();
        int num = in.nextInt();
        int gift;
        int keep;
        if(num == 0){
            gift = 0;
          
        }else{
        gift = amount / num;
        keep = amount % num;
        pn.set(indexer, pn.get(indexer) + (keep-amount));
        }
        s = in.nextLine();
        for(int x = 0; x<num; x++){
            s = in.nextLine();
            int index = sn.indexOf(s);
            pn.set(index, pn.get(index) + gift);
        }
    }
    
    for(int r = 0;r<np;r++){
        out.print(sn.get(r) + " " + pn.get(r));
        out.println();
    }

    out.close();                                  // close the output file
  }
}