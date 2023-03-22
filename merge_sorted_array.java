import java.util.*;
// import java.io.*;
public class merge_sorted_array {
    public static void main(String[] args) {
        
        int[] nums1={1,2,3,0,0,0};
        int m=3,n=3;
        int[] nums2={2,5,6};
        for(int i=m;i<n+m;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
