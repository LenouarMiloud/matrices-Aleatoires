package matricesaleatoires;

import java.security.SecureRandom;

public class MatricesAleatoires {

    public static void main(String[] args) {
        // TODO code application logic here
     
        final int N = 4;
        SecureRandom rd = new SecureRandom();
        int [][] mat = new int[N][N]; 
        int n=17;
        int k,x,y;
            while(n>1){
                k = rd.nextInt(n);
                x = rd.nextInt(4);
                y = rd.nextInt(4);
                mat[x][y] = k;
                n = n-k;
        }
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(mat[i][j]);
                    System.out.print("\t");
                }
                System.out.println();
            } 
        
    }
}
    
