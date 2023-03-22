public class xyz {
    public static void main(String[] args) {
        String num="00123";
        String num1="";
        int i;
        for(i=0;i<num.length();i++){
            int max= -1;
            int c= Integer.parseInt(String.valueOf(num.charAt(i)));
            max=Math.max(max,c);
            if(max>0){break;}
            if(c==0){
                continue;
            }
            num1+=num.charAt(i);
        }
        while(i<num.length()){
            num1+=num.charAt(i);
            i++;
        }
        num=num1;
        System.out.println(num);
    }
}
