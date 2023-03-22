import java.util.*;
public class reshaping_the_matrix {
    public static void main(String[] args) {
        int[][] q = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int[][] a = matrixReshape(q, r, c);
        // printing the matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if (r * c != (mat.length)*mat[0].length) 
        {
            return mat;
        } 
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                list.add(mat[i][j]);
            }
        }
        int[][] ans = new int[r][c];
        int cnt=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=list.get(cnt);
                cnt++;
            }
        }
        return ans;
    }
}
