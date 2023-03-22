public class longestcommonprefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        int n=strs.length;
            String ans="";
            int min=201;
            for(int i=0;i<n;i++){
                min=Math.min(min,strs[i].length());
            }

            if(min==0)return "";
            for(int i=0;i<min;i++){
                ans=ans+strs[0].charAt(i);
                for(int j=0;j<n;j++){
                    if(ans.charAt(i)!=strs[j].charAt(i)){
                        return ans;
                    }
                }
            }
            //ans "flo"
            ans=ans.substring(0,ans.length());//deleting last character
            return ans;
    }
}
