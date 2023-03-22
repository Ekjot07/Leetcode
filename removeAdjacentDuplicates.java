import java.util.*;
public class removeAdjacentDuplicates {
    public static void main(String[] args) {
        String s="abbaca";
        
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                if(stack.peek()==c){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char c=stack.peek();
            sb.append(c);
            stack.pop();
        }

        System.out.println(sb.reverse());
    }
}
