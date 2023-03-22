// import java.util.*;
// import java.io.*;
// import java.lang.*;

public class Palindrome_str {
    public static String longestPalindrome(String s) 
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                StringBuilder sb=new StringBuilder(sub);
                String rev=sb.reverse().toString();
                if(rev.equals(sub))
                {
                      if(temp.length()<sub.length())
                      {
                          temp=sub;
                      }  
                }   
            }
        }
        return temp;
    }
   public static void main(String Args[]) {
        String s="ac";
        String ans=longestPalindrome(s);
        System.out.println(ans);
   } 
}
