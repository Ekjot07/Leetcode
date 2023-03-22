public class shortestPalindrome {
    public static void main(String[] args) {
        String s="xyz";
        // output == "dcabbaabbacd"
        // answer == "dcabbacd"
        System.out.println(shortestpalindrome(s));
    }
    
    public static String shortestpalindrome(String s) {
        if(s.length()==0){return "";}

        StringBuilder str=new StringBuilder(s);
        if(isPalindrome(str)){
            return str.toString();
        }
        
        StringBuilder okok=new StringBuilder(s);
        int n=str.length();
        str.reverse();
        StringBuilder ans=new StringBuilder();
        str.append(okok);
        int max=str.length();

        for(int i=n+1;i<=str.length();i++){
            String temp1=str.substring(0,i);
            StringBuilder temp=new StringBuilder(temp1);
            if(isPalindrome(temp)){
                ans=temp;
                break;
            }
        }
        if(ans.length()==max){
            StringBuilder temp=str;
            for(int i=(ans.length()/2)-1;i>1;){
                temp.deleteCharAt(i);
                if(isPalindrome(temp)  && temp.toString().contains(s)){
                    ans=temp;
                    System.out.println(ans+" forloop");
                }
                i=(ans.length()/2)-1;
            }
        }    
        return ans.toString();
    }    
    public static boolean isPalindrome(StringBuilder s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
