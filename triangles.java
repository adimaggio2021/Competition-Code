
import java.util.*;
import java.io.*;
import java.math.*;

public class triangles {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("triangles.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
        int num = in.nextInt();
        int [] x = new int[num];
        int [] y = new int[num];
        for(int i = 0; i<num; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        int max = 0;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                if(y[i] == y[j]){
                        for(int l = 0; l<num; l++){
                            if(x[i] == x[l]){
                                int area = (x[i] - x[j])*(y[i]-y[l]);
                                if(Math.abs(area)>max)max = Math.abs(area);
                    
                            }else if(x[j] == x[l]){
                                int area = (x[i] - x[j])*(y[j]-y[l]);
                                if(Math.abs(area)>max)max = Math.abs(area);
                    
                            }
                        }
                }
            }
        }
              out.println(max);
              out.close();
        
    }


}