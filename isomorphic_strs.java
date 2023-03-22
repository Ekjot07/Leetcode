import java.util.*;
public class isomorphic_strs {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }    
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        
        HashMap<Character, Character> map = new HashMap<>();
        // K =c1 V=c2
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2){
                    return false;
                }
                
                else if(map.containsValue(c2)){
                    return false;
                }
                
                else{
                    map.put(c1,c2);
                }
            }
            }
        return true;
    }
}