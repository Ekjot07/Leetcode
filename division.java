public class division {
    public static void main(String[] args) {
        int dividend=10;
        int divisor=-3;

        int cnt=0;
        int prod=0;
        
        if(dividend==0){
            System.out.println(0);
            return;
        }
        
        if(dividend<0 && divisor>0){
            prod=-1;
        }
        else if(dividend>0 && divisor<0){
            prod=-1;
        }
        else{
            prod=1;
        }
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        
        while(dividend>=0){
            dividend=dividend-divisor;
            cnt++;
        }
        cnt=cnt-1;
        if(prod==-1){
            cnt=-cnt;
        }
        int max=Integer.MAX_VALUE;
        if(cnt>max-1){
            System.out.println(max);
            return;
        }
        if(cnt<-max){
            System.out.println(-max);
            return;
        }

        System.out.println(cnt);
    }
}
