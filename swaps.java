import java.io.*;
import java.util.*;
public class swaps {
    public static int solve(ArrayList<Integer> ar, int B) {
        ArrayList<Integer> A=new ArrayList<>(ar);
        ArrayList<Integer> arr=new ArrayList<>(ar);
        // System.out.println(A);
        // System.out.println(ar);
        int swaps=0;
        Collections.sort(arr,Collections.reverseOrder());
        int n=ar.size();
        for(int i=0;i<n;i++){
            int a=arr.get(i);
            int idx=A.indexOf(a);
            swaps+=Math.abs(idx-i);
            ar.remove(idx);
            // System.out.println(idx+" "+);
            ar.add(i,a);
            A.remove(idx);
            A.add(i,-1);
            // System.out.println(A);
            // System.out.println(ar);
            System.out.println(swaps);
        }
        System.out.println(swaps);
        if(swaps<=B) return 1;
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(list,3));
    }
}
