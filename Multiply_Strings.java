public class Multiply_Strings {
        public static void main(String args[]){
            String num1="90";
            String num2="0";
            String ans=multiply(num1,num2);
            System.out.println(ans);
        }
public static String multiply(String num1, String num2) {
    if(num1=="0" || num2=="0"){
        return "0";
    }
    int n1=0,n2=0;
    char currchar;
    for(int i=0; i<num1.length();i++){
        currchar= num1.charAt(i);
        n1=10*n1+(currchar-'0');
    }
    for(int i=0; i<num2.length();i++){
        currchar= num2.charAt(i);
        n2=10*n2+ (currchar-'0');
    }
    int prod=n1*n2;

    String ans="";

    while(prod>0){
        int d=prod%10;
        char c=(char)(d+'0');
        ans+=c;
        prod=prod/10;
    }
    char ch;
    String nstr="";
    for (int i=0; i<ans.length(); i++)
      {
        ch= ans.charAt(i);
        nstr= ch+nstr;
      }
    return nstr;
}
}