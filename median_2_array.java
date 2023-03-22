import java.util.Arrays;

public class median_2_array {
    public static void main(String[] args) {
        int[] nums1={};
        int[] nums2={2,4};        
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        for(int i=m;i<m+n;i++){
            nums3[i]=nums2[i-m];
        }
        Arrays.sort(nums3);
        
        System.out.println(Arrays.toString(nums3));
        
        double med=0;
        int x=(nums3.length)/2;
        
        if(nums3.length%2==0){
            med=(double) ((double)nums3[x]+ (double)nums3[x-1])/2;
        }
        else{
            med=(double)nums3[x];
        }
        System.out.println(med);
    }
}
