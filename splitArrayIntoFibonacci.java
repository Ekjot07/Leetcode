import java.util.*;
public class splitArrayIntoFibonacci {
    public static void main(String[] args) {
        String num = "1101111";
        //split array into fibonacci sequence
        System.out.println(splitIntoFibonacci(num));
    }
    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> ans = new ArrayList<>();
        if (num.length() < 3) {
            return ans;
        }
        for (int i = 0; i < num.length() - 2; i++) {
            for (int j = i + 1; j < num.length() - 1; j++) {
                int a = Integer.parseInt(num.substring(0, i + 1));
                int b = Integer.parseInt(num.substring(i + 1, j + 1));
                ans.add(a);
                ans.add(b);
                int k = j + 1;
                while (k < num.length()) {
                    int c = a + b;
                    String str = Integer.toString(c);
                    if (num.substring(k).startsWith(str)) {
                        ans.add(c);
                        a = b;
                        b = c;
                        k += str.length();
                    } else {
                        break;
                    }
                }
                if (k == num.length()) {
                    return ans;
                }
                ans.clear();
            }
        }
        return ans;
    }
}
