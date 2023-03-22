import java.util.*;
public class doubleofN {
    public static void main(String[] args) {
        int[] arr={-2,10,0,-19,4,6,0,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Boolean ans=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(0)){
                if(arr[i]==0 && map.get(0)!=i){
                    return true;
                }   
            }
        }
        map.remove(0);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]*2)){
                ans=true;
                break;
            }
        }

        return ans;
    }
}
