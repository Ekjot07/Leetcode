public class Two_d_array {
    public static void main(String Args[]) {
        int nums[]={1,2,3,4,5};
        int cnt=0;
        int ans[]=new int[nums.length];
        
        for(int i=0,j=0;i<nums.length && j<nums.length;i++,j+=2){
            ans[j]=nums[i];
            cnt++;
        }
        for(int i=cnt,j=1;i<nums.length && j<nums.length;i++,j+=2){
            ans[j]=nums[i];
        }
        for (int i : ans) {
            System.out.println(i);
        }
}
}