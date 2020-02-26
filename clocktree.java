
import java.util.*;
import java.io.*;
import java.math.*;

public class clocktree {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("clocktree.in"));
        PrintWriter pw = new PrintWriter(new File("clocktree.out"));
        int num = in.nextInt();
        int [] x = new int[num];
        int [] xcount = new int[10000];
        int [] y = new int[num];
        int [] ycount = new int[10000];
        for(int i = 0; i<num; i++){
            x[i] = in.nextInt();
            xcount[x[i]] = xcount[x[i]] +1;
            y[i] = in.nextInt();
            ycount[y[i]] = xcount[y[i]] +1;
        }
        
    }

}