public class validPalindrome {
    public static void main(String[] args) {
        String s="ok!ko";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        Boolean ans=false;
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        String strc="";
        for(int i=str.length()-1;i>=0;i--){
            strc+=str.charAt(i);
        }
        if(str.equals(strc)){
            ans=true;
        }
        return ans;
    }
}
