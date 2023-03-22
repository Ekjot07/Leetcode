import java.util.Arrays;

public class maxprofit {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int n=prices.length;
        int[] min=new int[n];
        int[] max=new int[n];
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,prices[i]);
            min[i]=mini;
        }
        for(int i=n-1;i>0;i--){
            maxi=Math.max(maxi,prices[i]);
            max[i]=maxi;            
        }
        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(max));
        int profit=0;
        for(int i=0;i<n;i++){
            profit=Math.max(profit,(max[i]-min[i]));
        }
    }
}
