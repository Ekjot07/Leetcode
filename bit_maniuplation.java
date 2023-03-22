public class bit_maniuplation {
    public static void main(String[] args) {
        int start = 10;
        int goal = 82;
        // String a = Integer.toBinaryString(start);
        // String b = Integer.toBinaryString(goal);
        // System.out.println(a);
        // System.out.println(b);
        // int x = a.length();
        // int y = b.length();
        // int count = 0;
        // char ch;
        // String rev1 = "";
        // String rev2 = "";
        // for (int i = 0; i < x; i++) {
        //     ch = a.charAt(i);
        //     rev1 = ch + rev1;
        // }
        // for (int i = 0; i < y; i++) {
        //     ch = b.charAt(i);
        //     rev2 = ch + rev2;
        // }
        // System.out.println(rev1);
        // System.out.println(rev2);
        // if (x < y) {
        //     for (int i = x; i < y; i++) {
        //         rev1 += '0';
        //     }
        // } else {
        //     for (int i = y; i < x; i++) {
        //         rev2 += '0';
        //     }
        // }

        // for (int i = 0; i < Math.max(x, y); i++) {
        //     if (rev1.charAt(i) != rev2.charAt(i)) {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        int xor =start ^ goal;
        int count=0;
        while(xor>0){
            count++;
            xor=xor & (xor-1);
        }
        System.out.println(count);
    }
}
