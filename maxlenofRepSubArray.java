import java.util.*;
public class maxlenofRepSubArray {
    public static void main(String[] args) {
         int[] nums1={1,2,3,2,1};
         int[] nums2={1,2,3,2,1};
        // int[] nums1={0,0,0,0,0};
        // int[] nums2={0,0,0,0,0}; 
        // int[] nums1={3,2,1,4,7};
        // int[] nums2={3,2,1,4,7};
        //int[] nums2={52,70,39,5,31};
        List<Integer> list=new ArrayList<>();
        List<Integer> anslist=new ArrayList<>();
        int x=0;
        int y=0;
        int cnt=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    cnt=1;
                    x=i;
                    y=j;
                } 
            }
            if(cnt==0){
                continue;
            }
            else{
            while(x!=nums1.length && y!=nums2.length){
                if(nums1[x]==nums2[y]){
                    list.add(nums1[x]);
                    x++;
                    y++;
                }
                else{
                    break;
                }
            }
            if(list.size()>anslist.size()){
                anslist.clear();
                anslist.addAll(list);
            }
            list.clear();
            cnt=0;
            }
        }
        System.out.println(anslist);

    }
}

