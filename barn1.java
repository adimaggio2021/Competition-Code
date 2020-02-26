/*
ID: adimagg1
LANG: JAVA
TASK: barn1
*/
import java.io.*;
import java.util.*;

class barn1  {
    public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}

public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
 
    merge(a, l, r, mid, n - mid);
}
    
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    File f = new File("barn1.in");
    Scanner in = new Scanner(f);
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
    
    int m = in.nextInt();
    int s = in.nextInt();
    int c = in.nextInt();
    
    int[] ar = new int[c];
    
    for(int i = 0;i<c;i++){
        ar[i] = in.nextInt();
    }
    
    mergeSort(ar,ar.length);
    int stalls = ar[ar.length-1] - ar[0];
    ArrayList<Integer> js = new ArrayList<Integer>();
    int gapsize = 0;
    int jchill = 0;
    for(int i = 0; i<m-1; i++){
        gapsize = 0;
        for(int j = 0; j<ar.length-1;j++){
            if(ar[j+1] - ar[j] - 1> gapsize && !js.contains(j)){
                gapsize = ar[j+1] - ar[j] - 1;
                jchill = j;
            }
            
        }
        
        js.add(jchill);
        stalls -= gapsize;
    }
    
    out.println(stalls+1);
    
    out.close();
}


}