// import java.io.*;
import java.util.*;

public class doubled_array {
    public static void main(String[] args) {
        int q[]={1,3,4,2,6,8};
        int ans[]=findOriginalArray(q);
        System.out.println(ans);

    }
    public static int[] findOriginalArray(int[] changed) {
        
        int n = changed.length;
        int i = 0;
        
        if (n % 2 == 1){
             return new int[0];
        }
        int[] res = new int[n / 2];
        
        HashMap<Integer, Integer> count = new HashMap<>();
        
        for (int a : changed){
            count.put(a, count.getOrDefault(a, 0) + 1); //+1 to frequency if there otherwise default 0
        }
        
        for (int x : count.keySet()) {
            if (count.get(x) > count.getOrDefault(x + x, 0))
                return new int[0];
                for (int j = 0; j < count.get(x); ++j) {
                    res[i++] = x;
                    count.put(x + x, count.get(x + x) - 1);
                }
            }        
        return res;
    }
}