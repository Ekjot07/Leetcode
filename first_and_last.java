public class first_and_last {
    public static void main(String[] args) {
        int[] nums = { 5, 6,7, 7};
        int target =5;
        int[] a = searchRange(nums, target);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        if (nums.length == 0) 
        {
            return ans;
        }
        if (nums.length == 1) 
        {
            if (nums[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
                return ans;
            } else {
                return ans;
            }
        }
        if (nums.length == 2) 
        {
            if (nums[0] == target && nums[1] == target) {
                ans[0] = 0;
                ans[1] = 1;
                return ans;
            } else if (nums[0] == target && nums[1] != target) {
                ans[0] = 0;
                ans[1] = 0;
                return ans;
            } else if (nums[1] == target && nums[0] != target) {
                ans[0] = 1;
                ans[1] = 1;
                return ans;
            } else {
                return ans;
            }
        }
        int lo = 0;
        int hi = nums.length - 1;
        while (hi - lo > 1) 
        {
            int mid = (hi + lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        int start = 0, end = 0;

        if (nums[lo] != target && nums[hi] != target) 
        {
            return ans;
        }

        if (nums[lo] == target) 
        {
            start = lo;
            end = lo;
        } 
        else 
        {
            start = hi;
            end = hi;
        }

        while (nums[start] == target) 
        {
            if (start == 0) 
            {
                break;
            }
            start--;
        }
        if (nums[0]==target) 
        {
            start=0;
        }
        else if(nums[1]==target){
            start=1;
        }
        else{
            start++;
        }
        while (nums[end] == target) 
        {
            if (end == nums.length-1) 
            {
                 ans[0]=start;
                 ans[1]=end;
                 return ans;
            }
            end++;
        }
        ans[0] = start;
        ans[1] = end - 1;
        return ans;

    }
}
